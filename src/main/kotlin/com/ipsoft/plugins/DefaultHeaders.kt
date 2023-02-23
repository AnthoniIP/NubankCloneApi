package com.ipsoft.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*
import java.time.Duration

fun Application.configureDefaultHeaders() {
    install(DefaultHeaders) {
        val oneYearInSeconds = Duration.ofDays(365).seconds
        header(HttpHeaders.CacheControl, "public,max-age=$oneYearInSeconds") // will send this header with each response
    }
}