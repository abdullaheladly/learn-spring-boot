package com.abdullah996.learnspringboot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class CurrencyConfigrationController {
    @Autowired
    lateinit var currencyServiceConfiguration:CurrencyServiceConfiguration

    @RequestMapping("/currency-configuration")
    fun retrieveAllCourses(): CurrencyServiceConfiguration {
        return currencyServiceConfiguration
    }
}