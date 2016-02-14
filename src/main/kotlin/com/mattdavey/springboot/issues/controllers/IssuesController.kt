package com.mattdavey.springboot.issues.controllers

import com.mattdavey.springboot.issues.entities.Issue

interface IssuesController {

  fun getIssues() : List<Issue>
}