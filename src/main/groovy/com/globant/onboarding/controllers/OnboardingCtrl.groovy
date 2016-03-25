package com.globant.onboarding.controllers

import com.globant.onboarding.services.CoursesService
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@Slf4j
@RequestMapping("/onboarding")
public class OnboardingCtrl {
    @Autowired
    private CoursesService coursesService

    @RequestMapping(value = "/user/id/{id}/courses", method = RequestMethod.GET)
    def getCursesByUser(@PathVariable Integer id) {
        def res = coursesService.getCursesByUserId(id)
        if (res) {
            return new ResponseEntity<>(res, HttpStatus.OK)
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT)
        }
    }
}
