package com.ipsoft.routes

import com.ipsoft.data.repository.LoginRepository
import com.ipsoft.models.requests.LoginRequest
import io.ktor.server.application.call
import io.ktor.server.request.ContentTransformationException
import io.ktor.server.request.receive
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.post
import org.koin.ktor.ext.inject

fun Route.performLogin() {
    val repository: LoginRepository by inject()

    post(LOGIN_ROUTE) {
        try {
            val postParameters = call.receive<LoginRequest>()
            val username = postParameters.login
            val password = postParameters.password

            require(username.isNotBlank() && password.isNotBlank())

            val response = repository.performLogin(username, password)

            call.respond(response)
        } catch (e: IllegalArgumentException) {
            call.respondText { "Login and password must be provide to perform login" }
        } catch (e: ContentTransformationException) {
            call.respondText { "Login and password must be provide to perform login" }
        }
    }
    get(LOGIN_ROUTE) {
        call.respondText { "Only post requests allowed for this route" }
    }
}
