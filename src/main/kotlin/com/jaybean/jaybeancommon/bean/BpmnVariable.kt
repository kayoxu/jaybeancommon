package com.jaybean.jaybeancommon.bean

import java.io.Serializable
import java.util.*


class BpmnVariable : Serializable {

    var id: String? = null
    var name: String? = null
    var textValue: String? = null
    var value: Any? = null

    var revision: Int? = null

    var executionId: String? = null
    var processInstanceId: String? = null
    var processDefinitionId: String? = null
    var activityInstanceId: String? = null

    var isTransient: Boolean? = null
}
