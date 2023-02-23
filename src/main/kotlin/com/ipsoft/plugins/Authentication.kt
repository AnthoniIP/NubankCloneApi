package com.ipsoft.plugins

import com.ipsoft.constants.LOGIN_FORM
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*

fun Application.configureAuthentication() {
    authentication {
        form(name = LOGIN_FORM) {
            userParamName = "user"
            passwordParamName = "password"
            validate { credentials ->
                if (credentials.name == "anthoni" && credentials.password == "123456") {
                    UserIdPrincipal(credentials.name)
                } else {
                    null
                }
            }
            challenge {
                call.respond(HttpStatusCode.Unauthorized, "Credentials are not valid")
            }
        }
    }
}