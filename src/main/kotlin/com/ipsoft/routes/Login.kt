package com.ipsoft.routes

import com.ipsoft.extensions.encodeToBase64
import com.ipsoft.models.LoginResponse
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.performLogin() {
    post(LOGIN_ROUTE) {
        val postParameters = call.receiveParameters()
        val username = postParameters["username"]
        val password = postParameters["password"]

        if (username != null && password != null) {
            call.respond(
                message = LoginResponse(
                    status = 200,
                    message = "ok",
                    id = 1,
                    userName = username,
                    authenticationToken = "$username - $password".encodeToBase64(),
                    currentMoney = 5000.40,
                )
            )
        } else {
            call.respondText { "You must provide login and password fields to perform login" }
        }

    }
}