package com.ipsoft.data.mongodb

import com.ipsoft.models.responses.LoginResponse

class MongoServiceImpl : MongoService {
    override suspend fun verifyUserCredentials(login: String, password: String): LoginResponse {
        return LoginResponse(
            200,
            "ok",
            0,
            "valor retornado do MongoService ALTERAR LÓGICA AQUI DEPOIS",
            0.0,
            ""
        )
    }
}