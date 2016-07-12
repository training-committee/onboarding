package com.globant.onboarding.controllers

import com.globant.onboarding.model.Course
import com.globant.onboarding.services.CoursesService
import spock.lang.Specification

/**
 * Created by frank on 7/4/2016.
 */

class CourseCtrlSpec extends Specification {

    CourseCtrl controller

    def setup() {
        controller = new CourseCtrl()
        controller.coursesService = Mock(CoursesService)
    }


    void "it should render a course"() {
        given:
            Long id = 1
            Course course = new Course(id: 1, name: 'name')
        when:
            Course response = controller.show(id)
        then:
            1 * controller.coursesService.findById(1L) >> course
        and:
            response.id == 1
            response.name == 'name'
    }
}
