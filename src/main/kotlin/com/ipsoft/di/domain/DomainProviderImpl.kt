package com.ipsoft.di.domain

import com.ipsoft.di.repository.RepositoryProvider
import com.ipsoft.feature.auth.domain.CreateUserAuthTokenUseCase
import com.ipsoft.feature.auth.domain.LoginUserUseCase
import com.ipsoft.feature.user.domain.CurrentUserDetailUseCase
import com.ipsoft.feature.user.domain.FindUserByIdUseCase
import com.ipsoft.feature.user.domain.GetUserPostsUseCase
import com.ipsoft.feature.user.domain.UpdateCurrentUserUseCase

class DomainProviderImpl(private val repositoryProvider: RepositoryProvider) : DomainProvider {

    override fun provideCreateUserAuthTokenUseCase(): CreateUserAuthTokenUseCase {
        return DomainLocator.provideCreateUserAuthTokenUseCase(repositoryProvider.provideAuthRepository())
    }

    override fun provideLoginUserUseCase(): LoginUserUseCase {
        return DomainLocator.provideLoginUserUseCase(repositoryProvider.provideAuthRepository())
    }

    override fun provideFindUserByIdUseCase(): FindUserByIdUseCase {
        return DomainLocator.provideFindUserByIdUseCase(repositoryProvider.provideUserRepository())
    }

    override fun provideCurrentUserDetailUseCase(): CurrentUserDetailUseCase {
        return DomainLocator.provideCurrentUserDetailUseCase(repositoryProvider.provideUserRepository())
    }

    override fun provideUpdateCurrentUserUseCase(): UpdateCurrentUserUseCase {
        return DomainLocator.provideUpdateCurrentUserUseCase(repositoryProvider.provideUserRepository())
    }

    override fun provideGetUserPostsUseCase(): GetUserPostsUseCase {
        return DomainLocator.provideGetUserPostsUseCase(repositoryProvider.provideUserRepository())
    }
}
