package com.mattdavey.springboot.issues.entities

data class Issue(val id: String, val title: String, val activity: List<Transition>)