package com.mattdavey.springboot.workflow.controllers

import com.mattdavey.springboot.workflow.entities.WorkflowStage

interface WorkflowController {
  fun getWorkflowStages() : List<WorkflowStage>
}