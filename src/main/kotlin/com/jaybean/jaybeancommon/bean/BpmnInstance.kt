package com.jaybean.jaybeancommon.bean

import java.io.Serializable
import java.util.*


class BpmnInstance : Serializable {
    var id: String? = null
    var processInstanceId: String? = null
    var processDefinitionId: String? = null
    var rootProcessInstanceId: String? = null
    var isSuspended: Boolean? = null

}
