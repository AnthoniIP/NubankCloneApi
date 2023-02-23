package com.ipsoft.util

import com.ipsoft.base.auth.UserIdPrincipalForUser
import io.ktor.server.application.ApplicationCall
import io.ktor.server.application.call
import io.ktor.server.auth.authentication
import io.ktor.server.request.receive
import io.ktor.util.pipeline.PipelineContext

fun PipelineContext<*, ApplicationCall>.getUserId(): String? {
    val principal = this.call.authentication.principal<UserIdPrincipalForUser>()
    return principal?.userId
}

suspend inline fun <reified T : Any> PipelineContext<*, ApplicationCall>.getBodyContent(): T {
    return call.receive()
}
