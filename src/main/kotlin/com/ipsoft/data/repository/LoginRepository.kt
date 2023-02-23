package com.ipsoft.data.repository

import com.ipsoft.models.responses.LoginResponse

interface LoginRepository {
    suspend fun performLogin(login: String, password: String): LoginResponse
}
