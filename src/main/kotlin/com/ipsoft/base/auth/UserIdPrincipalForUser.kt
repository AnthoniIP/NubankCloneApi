package com.ipsoft.base.auth

import io.ktor.server.auth.Principal

data class UserIdPrincipalForUser(val userId: String) : Principal
