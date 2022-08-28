package com.jaybean.jaybeancommon.utils

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature


object JsonUtils {

    val mapper = ObjectMapper()

    /*
    * json转实体
    * 无法转嵌套类型
    * */
    @Deprecated("请使用 inline fun <reified T> toBean(json: String?): T?")
    fun <T> toBean(json: String?, clazz: Class<T>?): T? {
        var t: T? = null
        try {
            t = mapper.readValue(json, clazz)
        } catch (e: Exception) {
        }
        return t
    }


    /*
    * json转实体
    * 无法转嵌套类型
    *
    * */
    @Deprecated("请使用 inline fun <reified T> toBean(json: String?): T?")
    fun <T> toBeanList(json: String?, clazz: Class<T>?): List<T>? {
        return try {
            mapper.readValue(json, getCollectionType(MutableList::class.java, clazz!!))
        } catch (e: Exception) {
            ArrayList()
        }
    }


    inline fun <reified T> toBean(json: String?): T? {
        var t: T? = null
        try {
            t = mapper.readValue(json, object : TypeReference<T>() {})
        } catch (e: Exception) {
        }
        return t
    }


    fun toMap(json: String): Map<String?, Any?> {
        return mapper.readValue(json, object : TypeReference<Map<String?, Any?>?>() {}) ?: HashMap()
    }

    /*
     * 实体转json
     * */
    fun toJson(data: Any?): String? {
        if (data == null) {
            return null
        }
        var json: String? = null
        try {
            json = mapper.writeValueAsString(data)
        } catch (e: JsonProcessingException) {
        }
        return json
    }


    private fun getCollectionType(collectionClass: Class<*>, vararg elementClasses: Class<*>): JavaType? {
        return mapper.typeFactory.constructParametricType(collectionClass, *elementClasses)
    }

    init {
        // 对于空的对象转json的时候不抛出错误
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS)
        // 允许属性名称没有引号
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true)
        // 允许单引号
        mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true)
        // 设置输入时忽略在json字符串中存在但在java对象实际没有的属性
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
        // 设置输出时包含属性的风格
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL)
    }
}
