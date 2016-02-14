package com.mattdavey.springboot.healthcheck

import com.mattdavey.springboot.Application
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.boot.test.WebIntegrationTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.web.client.RestTemplate

@RunWith(SpringJUnit4ClassRunner::class)
@SpringApplicationConfiguration(classes = arrayOf(Application::class))
@WebIntegrationTest(randomPort = true)
class HealthResourceV1IT {

    @Value("\${local.server.port}")
    lateinit var port: String

    val baseUrl = "http://localhost"


    @Test
    fun shouldReturnHealthMessage() {
        val status = RestTemplate().getForObject("$baseUrl:$port/api/v1/health",
                HealthResourceV1.HealthStatus::class.java)
        assertThat(status).isEqualToComparingFieldByField(HealthResourceV1.HealthStatus("I'm healthy!"))
    }
}