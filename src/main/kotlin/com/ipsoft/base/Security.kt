package com.ipsoft.base

import com.ipsoft.base.auth.JwtConfig
import com.ipsoft.base.auth.UserIdPrincipalForUser
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.auth.Authentication
import io.ktor.server.auth.jwt.jwt

fun Application.configureSecurity() {
    install(Authentication) {
        jwt {
            verifier(JwtConfig.instance.verifier)
            validate {
                val claim = it.payload.getClaim(JwtConfig.ClAIM).asString()
                if (claim != null) {
                    UserIdPrincipalForUser(claim)
                } else {
                    null
                }
            }
        }
    }
}
