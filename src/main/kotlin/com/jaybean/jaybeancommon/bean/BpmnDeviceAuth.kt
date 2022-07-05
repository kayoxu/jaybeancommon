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
    var deviceId: Long? = null
    var times: ArrayList<BpmnDeviceAuthTime> = ArrayList()
}

class BpmnDeviceAuthTime : Serializable {
    var startTime: Long? = null
    var endTime: Long? = null
}
