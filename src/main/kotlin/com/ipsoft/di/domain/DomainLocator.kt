package com.ipsoft.di.domain

import com.ipsoft.di.repository.RepositoryLocator
import com.ipsoft.feature.auth.domain.CreateUserAuthTokenUseCase
import com.ipsoft.feature.auth.domain.LoginUserUseCase
import com.ipsoft.feature.auth.repository.AuthRepository
import com.ipsoft.feature.user.domain.CurrentUserDetailUseCase
import com.ipsoft.feature.user.domain.FindUserByIdUseCase
import com.ipsoft.feature.user.domain.GetUserPostsUseCase
import com.ipsoft.feature.user.domain.UpdateCurrentUserUseCase
import com.ipsoft.feature.user.repository.UserRepository

/**
 * [DomainLocator] creates a collection of instances of all the domains
 */
object DomainLocator {
    /**
     * [provideCreateUserAuthTokenUseCase] provides the [CreateUserAuthTokenUseCase] instance to [DomainProvider]
     */
    fun provideCreateUserAuthTokenUseCase(authRepository: AuthRepository): CreateUserAuthTokenUseCase {
        return CreateUserAuthTokenUseCase(authRepository)
    }

    /**
     * [provideLoginUserUseCase] provides the [LoginUserUseCase] instance to [DomainProvider]
     */
    fun provideLoginUserUseCase(authRepository: AuthRepository): LoginUserUseCase {
        return LoginUserUseCase(authRepository)
    }

    /**
     * [provideFindUserByIdUseCase] provides the [FindUserByIdUseCase] instance to [DomainProvider]
     */
    fun provideFindUserByIdUseCase(userRepository: UserRepository): FindUserByIdUseCase {
        return FindUserByIdUseCase(userRepository)
    }

    /**
     * [provideCurrentUserDetailUseCase] provides the [CurrentUserDetailUseCase] instance to [DomainProvider]
     */
    fun provideCurrentUserDetailUseCase(userRepository: UserRepository): CurrentUserDetailUseCase {
        return CurrentUserDetailUseCase(userRepository)
    }

    /**
     * [provideUpdateCurrentUserUseCase] provides the [UpdateCurrentUserUseCase] instance to [DomainProvider]
     */
    fun provideUpdateCurrentUserUseCase(userRepository: UserRepository): UpdateCurrentUserUseCase {
        return UpdateCurrentUserUseCase(userRepository)
    }

    /**
     * [provideGetUserPostsUseCase] provides the [GetUserPostsUseCase] instance to [DomainProvider]
     */
    fun provideGetUserPostsUseCase(userRepository: UserRepository): GetUserPostsUseCase {
        return GetUserPostsUseCase(userRepository)
    }

    /**
     * [provideDomainProvider] provides the [DomainProvider] instance
     */
    fun provideDomainProvider(): DomainProvider {
        return DomainProviderImpl(RepositoryLocator.provideRepositoryProvider())
    }
}
