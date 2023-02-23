package com.ipsoft.di

import com.ipsoft.data.mongodb.MongoService
import com.ipsoft.data.mongodb.MongoServiceImpl
import com.ipsoft.data.repository.LoginRepository
import com.ipsoft.data.repository.LoginRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<MongoService> { MongoServiceImpl() }
    single<LoginRepository> { LoginRepositoryImpl(get()) }
}