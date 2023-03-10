package com.ipsoft.base.http

import com.ipsoft.base.AuthorizationException
import com.ipsoft.base.BadRequestException
import com.ipsoft.base.ConflictException
import com.ipsoft.base.NotFoundException
import com.ipsoft.base.SomethingWentWrongException

/**
 * Handles the Exceptions and implements the interface [ExceptionHandler]
 */
class ExceptionHandlerImpl : ExceptionHandler {

    override fun respondWithBadRequestException(message: String?): Exception {
        return BadRequestException(message)
    }

    override fun respondWithUnauthorizedException(message: String?): Exception {
        return AuthorizationException(message)
    }

    override fun respondWithNotFoundException(message: String?): Exception {
        return NotFoundException(message)
    }

    override fun respondWithAlreadyExistException(message: String?): Exception {
        return ConflictException(message)
    }

    override fun respondWithGenericException(message: String?): Exception {
        return SomethingWentWrongException(message)
    }

    override fun respondWithSomethingWentWrongException(message: String): Exception {
        return SomethingWentWrongException(message)
    }
}
