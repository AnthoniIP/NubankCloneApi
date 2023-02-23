package com.ipsoft.di

import com.ipsoft.base.auth.JwtConfig
import com.ipsoft.base.http.ExceptionHandler
import com.ipsoft.base.http.ExceptionHandlerImpl

object ConfigLocator {

    fun provideJwtConfig() {
        return JwtConfig.initialize("ktor-backend")
    }

    fun provideExceptionHandler(): ExceptionHandler {
        return ExceptionHandlerImpl()
    }
}
