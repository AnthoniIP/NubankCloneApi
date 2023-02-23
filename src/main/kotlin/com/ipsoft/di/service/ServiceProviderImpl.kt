package com.ipsoft.di.service

import com.ipsoft.di.database.DatabaseLocator
import com.ipsoft.feature.user.service.UserApiService

class ServiceProviderImpl : ServiceProvider {

    override fun provideUserApiService(): UserApiService {
        return ServiceLocator.provideUserApiService(DatabaseLocator.provideDatabase().userCollection)
    }
}
