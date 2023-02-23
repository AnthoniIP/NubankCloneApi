package com.ipsoft.plugins

import com.ipsoft.routes.performLogin
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        performLogin()
    }
}
