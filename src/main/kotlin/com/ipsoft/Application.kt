package com.ipsoft

import com.ipsoft.base.configureRoutingAndSerialization
import com.ipsoft.base.configureSecurity
import com.ipsoft.base.configureStatusPages
import com.ipsoft.base.http.configureHTTP
import com.ipsoft.di.ConfigLocator
import io.ktor.server.application.Application

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

/**
 * Please note that you can use any other name instead of *module*.
 * Also note that you can have more then one modules in your application.
 * */

private val serviceLocator = ConfigLocator

@SuppressWarnings("unused")
fun Application.module() {
    ConfigLocator.provideJwtConfig()
    configureStatusPages()
    configureSecurity()
    configureRoutingAndSerialization()
    configureHTTP()
}
