package com.lynas

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class SpringBootSecNeo4jApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringBootSecNeo4jApplication::class.java, *args)
}
