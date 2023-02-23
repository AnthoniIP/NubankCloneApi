package com.ipsoft.di.domain

import com.ipsoft.feature.auth.domain.CreateUserAuthTokenUseCase
import com.ipsoft.feature.auth.domain.LoginUserUseCase
import com.ipsoft.feature.user.domain.CurrentUserDetailUseCase
import com.ipsoft.feature.user.domain.FindUserByIdUseCase
import com.ipsoft.feature.user.domain.GetUserPostsUseCase
import com.ipsoft.feature.user.domain.UpdateCurrentUserUseCase

interface DomainProvider {

    fun provideCreateUserAuthTokenUseCase(): CreateUserAuthTokenUseCase

    fun provideLoginUserUseCase(): LoginUserUseCase

    fun provideFindUserByIdUseCase(): FindUserByIdUseCase

    fun provideCurrentUserDetailUseCase(): CurrentUserDetailUseCase

    fun provideUpdateCurrentUserUseCase(): UpdateCurrentUserUseCase

    fun provideGetUserPostsUseCase(): GetUserPostsUseCase
}
