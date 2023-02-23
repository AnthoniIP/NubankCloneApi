package com.ipsoft.models.responses

import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse(
    val status: Int,
    val message: String,
    val id: Int,
    val userName: String,
    val currentMoney: Double,
    val authenticationToken: String,
)
