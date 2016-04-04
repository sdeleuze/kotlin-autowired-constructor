package com.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.client.RestOperations

open class Foo @Autowired constructor(val restTemplate: RestOperations = NoOpRestOperations());