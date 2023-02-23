package com.ipsoft.extensions

import java.util.*

fun String.encodeToBase64(): String {
    val encodedBytes = Base64.getEncoder().encode(this.toByteArray())
    return String(encodedBytes)
}