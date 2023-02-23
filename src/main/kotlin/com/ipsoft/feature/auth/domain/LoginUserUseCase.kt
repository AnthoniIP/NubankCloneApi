package com.ipsoft.feature.auth.domain

import com.ipsoft.base.BaseUseCase
import com.ipsoft.feature.auth.AuthRequest
import com.ipsoft.feature.auth.repository.AuthRepository
import com.ipsoft.util.BaseResponse

/**
 * [LoginUserUseCase] is the UseCase which overrides [BaseUseCase]
 * and invokes to generate UserToken from [AuthRepositorys]
 */
class LoginUserUseCase(private val authRepository: AuthRepository) : BaseUseCase<AuthRequest, Any> {

    /**
     * [invoke] gets called when the UseCase in instantiated
     */
    override suspend fun invoke(input: AuthRequest): BaseResponse<Any> {
        return authRepository.loginUser(input)
    }
}
