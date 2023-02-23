package com.ipsoft.models

data class LoginResponse(
    val status: Int,
    val message: String,
    val id: Int,
    val userName: String,
    val currentMoney: Double,
    val authenticationToken: String,
)