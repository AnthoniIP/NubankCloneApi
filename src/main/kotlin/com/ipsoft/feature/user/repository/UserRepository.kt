package com.ipsoft.feature.user.repository

import com.ipsoft.feature.user.User
import com.ipsoft.util.BaseResponse

interface UserRepository {

    suspend fun findUserById(userId: String?): BaseResponse<Any>

    suspend fun currentUser(userId: String?): BaseResponse<Any>

    suspend fun updateUser(userId: String, user: User): BaseResponse<Any>

    suspend fun fetchUserPosts(userId: String): BaseResponse<Any>
}
