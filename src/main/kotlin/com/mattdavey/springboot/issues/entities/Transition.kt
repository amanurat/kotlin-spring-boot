package com.mattdavey.springboot.issues.entities

import java.time.LocalDateTime

data class Transition(val dateTime: LocalDateTime, val stageId: String)