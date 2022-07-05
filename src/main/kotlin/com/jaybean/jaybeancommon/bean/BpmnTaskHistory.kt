package com.jaybean.jaybeancommon.bean

import java.io.Serializable
import java.util.*


class BpmnTaskHistory : Serializable {

    var id: String? = null
    var name: String? = null
    var deleteReason: String? = null
    var taskDefinitionKey: String? = null
    var activityInstanceId: String? = null
    var durationInMillis: Long? = null
    var startTime: Long? = null
    var endTime: Long? = null
    var rootProcessInstanceId: String? = null
    var executionId: String? = null
    var processDefinitionId: String? = null
    var processDefinitionKey: String? = null
}
