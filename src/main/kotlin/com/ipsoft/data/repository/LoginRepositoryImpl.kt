package com.ipsoft.data.repository

import com.ipsoft.data.mongodb.MongoService
import com.ipsoft.models.responses.LoginResponse

class LoginRepositoryImpl(
    private val mongoService: MongoService
) : LoginRepository {
    override suspend fun performLogin(login: String, password: String): LoginResponse =
        mongoService.verifyUserCredentials(
            login, password
        )
}