package ru.kultushev.contact_book.di.providers.db

import android.content.Context
import ru.kultushev.contact_book.data.db.ContactsDatabase
import toothpick.InjectConstructor
import javax.inject.Provider

@InjectConstructor
class DatabaseProvider(
    private val applicationContext: Context
) : Provider<ContactsDatabase> {
    override fun get(): ContactsDatabase {
        return ContactsDatabase.getInstance(applicationContext)
    }
}