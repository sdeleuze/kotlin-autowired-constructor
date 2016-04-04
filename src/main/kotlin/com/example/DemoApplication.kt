package com.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class DemoApplication {

    @Bean
    open fun foo() = Foo()

}

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}

