package com.jaybean.jaybeancommon.bean

import java.io.Serializable
import java.util.*


class BpmnDeploy : Serializable {

    ///部署ID
    var id: String? = null

    ///版本号
    var version: Int? = null

    ///部署时间
    var deploymentTime: Long? = null
}
