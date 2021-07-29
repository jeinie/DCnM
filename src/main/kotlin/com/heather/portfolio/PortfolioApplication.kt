package com.heather.portfolio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class PortfolioApplication

fun main(args: Array<String>) {
    runApplication<PortfolioApplication>(*args)
}
