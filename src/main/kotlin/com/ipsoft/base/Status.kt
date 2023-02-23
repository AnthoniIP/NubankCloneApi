package com.ipsoft.base

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.statuspages.StatusPages
import io.ktor.server.response.respond

fun Application.configureStatusPages() {
    install(StatusPages) {
        exception<AuthenticationException> { call, cause ->
            call.respond(ExceptionResponse(HttpStatusCode.Unauthorized, cause.message.toString()))
        }
        exception<AuthorizationException> { call, cause ->
            call.respond(ExceptionResponse(HttpStatusCode.Forbidden, cause.message.toString()))
        }
        exception<BadRequestException> { call, cause ->
            call.respond(ExceptionResponse(HttpStatusCode.BadRequest, cause.message.toString()))
        }
        exception<NotFoundException> { call, cause ->
            call.respond(ExceptionResponse(HttpStatusCode.NotFound, cause.message.toString()))
        }
        exception<ConflictException> { call, cause ->
            call.respond(ExceptionResponse(HttpStatusCode.Conflict, cause.message.toString()))
        }
        exception<SomethingWentWrongException> { call, cause ->
            call.respond(ExceptionResponse(HttpStatusCode.ExpectationFailed, cause.message.toString()))
        }
    }
}

class AuthenticationException(message: String?) : RuntimeException(message)

class ConflictException(message: String?) : RuntimeException(message)

class AuthorizationException(message: String?) : RuntimeException(message)

class BadRequestException(message: String?) : RuntimeException(message)

class NotFoundException(message: String?) : RuntimeException(message)

class SomethingWentWrongException(message: String?) : RuntimeException(message)

data class ExceptionResponse(val code: HttpStatusCode, val message: String? = null)
