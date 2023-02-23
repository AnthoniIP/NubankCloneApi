package com.ipsoft.di.repository

import com.ipsoft.feature.auth.repository.AuthRepository
import com.ipsoft.feature.user.repository.UserRepository

interface RepositoryProvider {

    fun provideAuthRepository(): AuthRepository

    fun provideUserRepository(): UserRepository
}
