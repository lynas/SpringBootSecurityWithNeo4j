package com.lynas

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.lynas")
open class SpringBootSecNeo4jApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringBootSecNeo4jApplication::class.java, *args)
}
