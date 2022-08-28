package com.jaybean.jaybeancommon.beanVo

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
class ResultData<T> {

    /** 错误码.  */
    var code: Int? = null

    /** 提示信息.  */
    var msg: String? = null

    /** 具体内容.  */
    var data: T? = null

    var xtoken: String? = null
    var ytoken: String? = null
    var encryption: Boolean? = null
    var encryptionSendApp: Boolean? = null
}

@JsonInclude(JsonInclude.Include.NON_NULL)
class ResultPage {
    var total: Long? = 0
    var page: Long? = 0
    var size: Long? = 0
}

@JsonInclude(JsonInclude.Include.NON_NULL)
class ResultList<T> {
    var page: ResultPage? = null
    var data: List<T?>? = null

}
