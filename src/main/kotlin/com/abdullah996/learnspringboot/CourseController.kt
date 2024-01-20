package com.abdullah996.learnspringboot

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class CourseController {

    @RequestMapping("/courses")
    fun retrieveAllCourses(): List<Course> {
        return listOf(
            Course(8, "learn Aws", "in 28 minutes"),
            Course(2, "learn DevOps", "in 28 minutes"),
            Course(3, "learn Spring Boot", "in 28 minutes"),
            Course(3, "learn Spring Boot", "in 28 minutes"),
            Course(6, "learn Spring ", "in 28 minutes")
        )
    }
}