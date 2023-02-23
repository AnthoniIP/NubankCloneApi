package com.ipsoft.feature.auth

import io.ktor.resources.Resource

@Resource(AuthConstant.LOGIN)
class LoginUser

@Resource(AuthConstant.REGISTER)
class RegisterUser
