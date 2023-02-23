package com.ipsoft.feature.auth.repository

import com.ipsoft.feature.auth.AuthRequest
import com.ipsoft.util.BaseResponse

/**
 * [AuthRepository] is a collection of all the functions to Auth module
 */
interface AuthRepository {

    suspend fun createToken(authRequest: AuthRequest): BaseResponse<Any>

    suspend fun loginUser(authRequest: AuthRequest): BaseResponse<Any>
}
