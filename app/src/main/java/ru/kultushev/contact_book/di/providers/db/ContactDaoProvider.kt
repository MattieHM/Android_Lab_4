package ru.kultushev.contact_book.di.providers.db

import ru.kultushev.contact_book.data.db.ContactDao
import ru.kultushev.contact_book.data.db.ContactsDatabase
import toothpick.InjectConstructor
import javax.inject.Provider

@InjectConstructor
class ContactDaoProvider(
    private val database: ContactsDatabase
) : Provider<ContactDao> {
    override fun get(): ContactDao {
        return database.contactsDao()
    }
}