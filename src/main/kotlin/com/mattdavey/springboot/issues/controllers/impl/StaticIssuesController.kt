package com.mattdavey.springboot.issues.controllers.impl

import com.mattdavey.springboot.issues.controllers.IssuesController
import com.mattdavey.springboot.issues.entities.Issue
import com.mattdavey.springboot.issues.entities.Transition
import com.mattdavey.springboot.workflow.controllers.impl.StaticWorkflowController
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class StaticIssuesController : IssuesController {

  companion object {
    val ISSUE_1_ID = "ISSUE-1"
  }

  override fun getIssues(): List<Issue> {
    return listOf(
        Issue(id = ISSUE_1_ID, title = "Display issues", activity = listOf(
            Transition(
                dateTime = LocalDateTime.of(2016, 2, 10, 16, 0, 5, 0),
                stageId = StaticWorkflowController.TODO_ID),
            Transition(
                dateTime = LocalDateTime.of(2016, 2, 11, 12, 30, 17, 0),
                stageId = StaticWorkflowController.INPROGRESS_ID),
            Transition(
                dateTime = LocalDateTime.of(2016, 2, 13, 9, 43, 22, 0),
                stageId = StaticWorkflowController.UNDERREVIEW_ID),
            Transition(
                dateTime = LocalDateTime.of(2016, 2, 14, 20, 8, 0, 0),
                stageId = StaticWorkflowController.DONE_ID)
        ))
    )
  }
}