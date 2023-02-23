package com.ipsoft.di.repository

import com.ipsoft.di.service.ServiceProvider
import com.ipsoft.feature.auth.repository.AuthRepository
import com.ipsoft.feature.user.repository.UserRepository

class RepositoryProviderImpl(private val serviceProvider: ServiceProvider) : RepositoryProvider {

    override fun provideAuthRepository(): AuthRepository {
        return RepositoryLocator.provideAuthRepository(
            serviceProvider.provideUserApiService()
        )
    }

    override fun provideUserRepository(): UserRepository {
        return RepositoryLocator.provideUserRepository(serviceProvider.provideUserApiService())
    }
}
