package com.mattdavey.springboot.issues

import com.mattdavey.springboot.issues.controllers.IssuesController
import com.mattdavey.springboot.issues.entities.Issue
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/issues")
class IssuesResource @Autowired constructor(val issuesController: IssuesController) {

  @RequestMapping(method = arrayOf(RequestMethod.GET))
  fun getIssues() : List<Issue> {
    return issuesController.getIssues()
  }
}