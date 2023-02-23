package com.ipsoft.di.database

import com.ipsoft.base.database.Database
import com.ipsoft.base.database.DatabaseImpl

object DatabaseLocator {

    private fun provideClientName(): String {
        return "ktor-mongo"
    }

    fun provideDatabase(): Database {
        return DatabaseImpl(provideClientName())
    }
}
