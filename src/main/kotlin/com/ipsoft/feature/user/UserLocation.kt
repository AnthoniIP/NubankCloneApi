package com.ipsoft.feature.user

import io.ktor.resources.Resource

@Resource(UserConstant.USER_INFO)
data class UserInfo(val userId: String)

@Resource(UserConstant.CURRENT_USER)
class CurrentUser

@Resource(UserConstant.UPDATE_USER)
class UpdateUser
