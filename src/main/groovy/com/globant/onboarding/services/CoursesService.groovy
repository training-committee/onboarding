package com.globant.onboarding.services

import com.globant.onboarding.model.Course
import groovy.util.logging.Slf4j
import org.springframework.stereotype.Service

@Service
@Slf4j
class CoursesService {
    def getCourses() {
        log.debug("Entering getCourses...")
        //TODO: logic to find the curse corresponding to an user
        def res = [new Course(id: 1, name: "AngularJS", description: "AngularJS Course", media: "Test"),
                   new Course(id: 2, name: "HTML5", description: "HTML5 Course", media: "Test"),
                   new Course(id: 3, name: "CSS3", description: "CSS3 Course", media: "Test")]
    }
}
