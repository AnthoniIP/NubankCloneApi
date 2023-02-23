package com.ipsoft.base

import com.ipsoft.di.domain.DomainLocator
import io.ktor.serialization.gson.gson
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.auth.authenticate
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import io.ktor.server.resources.Resources
import io.ktor.server.routing.Routing
import io.ktor.server.routing.routing
import java.text.DateFormat

val domainLocator = DomainLocator

fun Application.configureRoutingAndSerialization() {
    install(Resources)
    install(Routing)
    install(ContentNegotiation) {
        gson {
            setDateFormat(DateFormat.LONG)
            setPrettyPrinting()
        }
    }

    routing {
        domainLocator.provideDomainProvider()
        authenticate {
            domainLocator.provideDomainProvider()
        }
    }
}
