package com.ipsoft.plugins

import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.defaultheaders.DefaultHeaders
import java.time.Duration

fun Application.configureDefaultHeaders() {
    install(DefaultHeaders) {
        val oneYearInSeconds = Duration.ofDays(365).seconds
        header(io.ktor.http.HttpHeaders.CacheControl, "public,max-age=$oneYearInSeconds") // will send this header with each response
    }
}
