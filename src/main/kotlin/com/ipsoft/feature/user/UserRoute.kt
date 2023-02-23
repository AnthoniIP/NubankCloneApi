package com.ipsoft.feature.user

import com.ipsoft.di.domain.DomainProvider
import com.ipsoft.util.getBodyContent
import com.ipsoft.util.getUserId
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.auth.authenticate
import io.ktor.server.resources.get
import io.ktor.server.response.respond
import io.ktor.server.routing.put
import io.ktor.server.routing.routing

fun Application.userRoutes(domainProvider: DomainProvider) {
    routing {
        get<UserInfo> { userRequest ->
            val response = domainProvider.provideFindUserByIdUseCase().invoke(userRequest.userId)
            call.respond(response)
        }

        authenticate {
            get<CurrentUser> {
                val userId = getUserId()
                val response = domainProvider.provideCurrentUserDetailUseCase().invoke(userId)
                call.respond(response)
            }

            put<UpdateUser> {
                val userId = getUserId()
                val user = getBodyContent<User>()
                val response =
                    domainProvider.provideUpdateCurrentUserUseCase().invoke(Pair(userId, user) as Pair<String, User>)
                call.respond(response)
            }
        }
    }
}
