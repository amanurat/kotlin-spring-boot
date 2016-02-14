package com.mattdavey.springboot.workflow.controllers.impl

import com.mattdavey.springboot.workflow.controllers.WorkflowController
import com.mattdavey.springboot.workflow.entities.WorkflowStage
import org.springframework.stereotype.Component

@Component
class StaticWorkflowController : WorkflowController {

  companion object {
    val TODO_ID = "todo"
    val INPROGRESS_ID = "inprogress"
    val UNDERREVIEW_ID = "UNDER_REVIEW"
    val DONE_ID = "done"
  }

  override fun getWorkflowStages(): List<WorkflowStage> {
    return listOf(
        WorkflowStage(id = TODO_ID, description = "To Do"),
        WorkflowStage(id = INPROGRESS_ID, description = "In Progress"),
        WorkflowStage(id = UNDERREVIEW_ID, description =  "Under Review"),
        WorkflowStage(id = DONE_ID, description = "Done"))
  }

}