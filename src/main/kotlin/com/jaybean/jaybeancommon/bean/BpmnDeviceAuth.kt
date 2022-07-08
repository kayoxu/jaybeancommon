package com.jaybean.jaybeancommon.bean

import java.io.Serializable
import java.util.*


//class BpmnDeviceAuth : Serializable {
//     var deviceIds: List<Long?>? = null
//    var startTime: Long? = null
//    var endTime: Long? = null
//
//}
class BpmnDeviceAuth : Serializable {
    var deviceNo: Long? = null
    var bpmns: ArrayList<BpmnDeviceAuthBpmn> = ArrayList()
}

class BpmnDeviceAuthBpmn : Serializable {
    var instanceId: String? = null
    var startTime: Long? = null
    var endTime: Long? = null
}
