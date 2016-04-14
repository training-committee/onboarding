package com.globant.onboarding.controllers

import com.globant.onboarding.model.Course
import com.globant.onboarding.services.CoursesService
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import java.security.Principal

@RestController
@Slf4j
@RequestMapping("/api")
public class OnboardingCtrl {
    @Autowired
    private CoursesService coursesService

    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    def getCourses() {
        def res = coursesService.getCourses()
        if (res) {
            return new ResponseEntity<>(res, HttpStatus.OK)
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT)
        }
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    def getUser(Principal principal) {
       return principal
    }

    @RequestMapping(value = "/course", method = RequestMethod.POST)
    def addCourse(Course course) {
        log.debug("Adding course...")
    }
}
