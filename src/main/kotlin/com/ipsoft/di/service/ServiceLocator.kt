package com.ipsoft.di.service

import com.ipsoft.feature.user.User
import com.ipsoft.feature.user.service.UserApiService
import com.ipsoft.feature.user.service.UserApiServiceImpl
import org.litote.kmongo.coroutine.CoroutineCollection

object ServiceLocator {
    fun provideUserApiService(userCollection: CoroutineCollection<User>): UserApiService {
        return UserApiServiceImpl(userCollection)
    }

    fun provideServiceProvider(): ServiceProvider {
        return ServiceProviderImpl()
    }
}
