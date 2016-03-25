package com.globant.onboarding.services

import com.globant.onboarding.model.Course
import groovy.util.logging.Slf4j
import org.springframework.stereotype.Service

@Service
@Slf4j
class CoursesService {
    def getCursesByUserId(id) {
        log.debug("Entering getCursesByUserId ${id}")
        //TODO: logic to find the curse corresponding to an user
        def res = [new Course(id:1, name:"Test", description: "Test Curse"), new Course(id:2, name:"Test2", description: "Another test Curse")]
    }
}
