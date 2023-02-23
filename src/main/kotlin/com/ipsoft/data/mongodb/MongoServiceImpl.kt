package com.ipsoft.data.mongodb

import com.ipsoft.models.responses.LoginResponse

class MongoServiceImpl: MongoService {
    override suspend fun verifyUserCredentials(login: String, password: String): LoginResponse {
        TODO("Not yet implemented")
    }
}