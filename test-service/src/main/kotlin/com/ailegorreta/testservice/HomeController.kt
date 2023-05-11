package com.ailegorreta.testservice

import com.ailegorreta.testservice.config.TestProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(val testProperties: TestProperties) {

    @GetMapping("/")
    fun getGreeting(): String? {
        return testProperties.greeting
    }

}