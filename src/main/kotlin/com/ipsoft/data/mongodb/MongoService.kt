package com.ipsoft.data.mongodb

import com.ipsoft.models.responses.LoginResponse

interface MongoService {
    suspend fun verifyUserCredentials(login: String, password: String): LoginResponse
}