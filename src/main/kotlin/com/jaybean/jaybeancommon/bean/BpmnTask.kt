package com.jaybean.jaybeancommon.bean

import java.io.Serializable
import java.util.*
import kotlin.collections.ArrayList


class BpmnTask : Serializable {

    ///任务ID
    var id: String? = null
    var name: String? = null

    var revision: Int? = null

    ///任务创建时间
    var createTime: Long? = null

    var executionId: String? = null
    var processInstanceId: String? = null
    var processDefinitionId: String? = null
    var taskDefinitionKey: String? = null
    var isDeleted: Boolean? = null

    var variable: ArrayList<BpmnVariable>? = null

    var bpmnFlowData: Any? = null

    var histories: ArrayList<BpmnTaskHistory>? = null

}
