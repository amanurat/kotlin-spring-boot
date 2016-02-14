package com.mattdavey.springboot.workflow

import com.mattdavey.springboot.workflow.controllers.WorkflowController
import com.mattdavey.springboot.workflow.entities.WorkflowStage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/workflow")
class WorkflowResourceV1 @Autowired constructor (val workflowController: WorkflowController) {

  @RequestMapping(path = arrayOf("/stages"), method = arrayOf(RequestMethod.GET))
  fun getWorkflowStages() : List<WorkflowStage> {
    return workflowController.getWorkflowStages()
  }

}