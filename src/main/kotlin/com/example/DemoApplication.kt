package com.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
open class DemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}

interface DemoRepository
@Repository open class DemoRepositoryImpl(): DemoRepository
open class NoOpDemoRepository(): DemoRepository

@RestController
open class DemoController @Autowired/*(required = false)*/ constructor(
        val demoRepo: DemoRepository = NoOpDemoRepository())
