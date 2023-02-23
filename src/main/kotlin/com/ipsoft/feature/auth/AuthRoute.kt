package com.ipsoft.feature.auth

import com.ipsoft.di.domain.DomainProvider
import com.ipsoft.util.getBodyContent
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.post
import io.ktor.server.routing.routing

fun Application.authRoutes(domainProvider: DomainProvider) {
    routing {
        post<LoginUser> {
            val authRequest = getBodyContent<AuthRequest>()
            val response = domainProvider.provideLoginUserUseCase().invoke(authRequest)
            call.respond(response)
        }

        post<RegisterUser> {
            val authRequest = getBodyContent<AuthRequest>()
            val response = domainProvider.provideCreateUserAuthTokenUseCase().invoke(authRequest)
            call.respond(response)
        }
    }
}
