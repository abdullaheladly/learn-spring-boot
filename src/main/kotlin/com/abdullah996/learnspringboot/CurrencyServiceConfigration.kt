package com.abdullah996.learnspringboot

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component


@ConfigurationProperties(prefix = "currency-service")
@Component
class CurrencyServiceConfiguration {
lateinit var url:String
lateinit var userName:String
lateinit var key:String
}