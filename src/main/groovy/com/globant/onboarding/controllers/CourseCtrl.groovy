package com.globant.onboarding.controllers

import com.globant.onboarding.model.Course
import com.globant.onboarding.services.CoursesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/api/course')
class CourseCtrl {

    @Autowired
    CoursesService coursesService

    @RequestMapping(value = '/{courseId}', method = RequestMethod.GET)
    @ResponseBody Course show(@PathVariable('courseId')Long id){
        return coursesService.findById(id)
    }


}
