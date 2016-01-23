package com.mattdavey.springboot.api

import com.fasterxml.jackson.annotation.JsonCreator
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/health")
class HealthResourceV1 {

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun healthCheck() : HealthStatus {
        return HealthStatus("I'm healthy!")
    }

    data class HealthStatus @JsonCreator constructor (val message : String)
}