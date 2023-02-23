package com.ipsoft.feature.user.domain

import com.ipsoft.base.BaseUseCase
import com.ipsoft.feature.user.repository.UserRepository
import com.ipsoft.util.BaseResponse

class GetUserPostsUseCase(private val userRepository: UserRepository) : BaseUseCase<String, Any> {

    override suspend fun invoke(input: String): BaseResponse<Any> {
        return userRepository.fetchUserPosts(input)
    }
}
