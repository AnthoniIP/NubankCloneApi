package com.ipsoft.di.service

import com.ipsoft.feature.user.service.UserApiService

interface ServiceProvider {
    fun provideUserApiService(): UserApiService
}
