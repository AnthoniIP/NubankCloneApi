package com.ipsoft.feature.user.domain

import com.ipsoft.base.BaseUseCase
import com.ipsoft.feature.user.User
import com.ipsoft.feature.user.repository.UserRepository
import com.ipsoft.util.BaseResponse

class UpdateCurrentUserUseCase(private val userRepository: UserRepository) : BaseUseCase<Pair<String, User>, Any> {

    override suspend fun invoke(input: Pair<String, User>): BaseResponse<Any> {
        return userRepository.updateUser(input.first, input.second)
    }
}
