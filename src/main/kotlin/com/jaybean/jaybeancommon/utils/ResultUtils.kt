package com.jaybean.jaybeancommon.utils

import com.jaybean.jaybeancommon.beanVo.ResultData


object BaseResultUtils {
    fun success(data: Any?): ResultData<*> {
        val result = ResultData<Any?>()
        result.data = data ?: ""
        result.code = 200
        result.msg = ""
        return result
    }


    fun error(code: Int?, msg: String?): ResultData<*> {
        val result: ResultData<*> = ResultData<Any?>()
        result.code = code
        result.msg = msg
        return result
    }

}
