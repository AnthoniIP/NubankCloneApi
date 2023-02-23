package com.ipsoft.di.repository

import com.ipsoft.base.auth.JwtConfig
import com.ipsoft.di.ConfigLocator
import com.ipsoft.di.service.ServiceLocator
import com.ipsoft.feature.auth.repository.AuthRepository
import com.ipsoft.feature.auth.repository.AuthRepositoryImpl
import com.ipsoft.feature.user.repository.UserRepository
import com.ipsoft.feature.user.repository.UserRepositoryImpl
import com.ipsoft.feature.user.service.UserApiService

object RepositoryLocator {

    fun provideAuthRepository(userApiService: UserApiService): AuthRepository {
        return AuthRepositoryImpl(
            userApiService,
            JwtConfig.instance,
            ConfigLocator.provideExceptionHandler()
        )
    }

    fun provideUserRepository(userApiService: UserApiService): UserRepository {
        return UserRepositoryImpl(
            userApiService,
            ConfigLocator.provideExceptionHandler()
        )
    }

    fun provideRepositoryProvider(): RepositoryProvider {
        return RepositoryProviderImpl(ServiceLocator.provideServiceProvider())
    }
}
