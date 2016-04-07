package com.example

import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration

@RunWith(SpringJUnit4ClassRunner::class)
@SpringApplicationConfiguration(classes = arrayOf(DemoApplication::class))
@WebAppConfiguration
class DemoApplicationTests {
    @Autowired lateinit var controller: DemoController

	@Test
	fun contextLoads() {
        assertTrue(controller.demoRepo is DemoRepositoryImpl)
	}

}
