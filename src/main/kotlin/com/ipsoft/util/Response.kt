package com.ipsoft.util

import io.ktor.http.HttpStatusCode

interface BaseResponse<T : Any>

data class SuccessResponse<T : Any>(
    val statusCode: HttpStatusCode,
    val data: T? = null,
    val message: String? = null
) : BaseResponse<T>

data class UnSuccessResponse<T : Any>(
    val statusCode: HttpStatusCode,
    val exception: T? = null
) : BaseResponse<T>

data class PaginatedResponse<T : Any>(
    val statusCode: HttpStatusCode,
    val prev: Int?,
    val next: Int?,
    val totalCount: Int = 0,
    val totalPages: Int = 0,
    val data: T? = null,
    val message: String? = null

) : BaseResponse<T>
