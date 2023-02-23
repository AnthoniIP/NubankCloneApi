package com.ipsoft

import com.ipsoft.plugins.*
import io.ktor.server.application.*
import io.ktor.server.netty.EngineMain.main as KtorMain

fun main(args: Array<String>): Unit =
    KtorMain(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureKoin()
    configureAuthentication()
    configureDefaultHeaders()
    configureSerialization()
    configureRouting()
    configureMonitoring()
    configureStatusPages()
}
