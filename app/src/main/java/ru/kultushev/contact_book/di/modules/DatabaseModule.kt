package ru.kultushev.contact_book.di.modules

import ru.kultushev.contact_book.data.db.ContactDao
import ru.kultushev.contact_book.data.db.ContactsDatabase
import ru.kultushev.contact_book.data.db.repository.ContactRepository
import ru.kultushev.contact_book.data.db.repository.IContactRepository
import ru.kultushev.contact_book.di.providers.db.ContactDaoProvider
import ru.kultushev.contact_book.di.providers.db.DatabaseProvider
import toothpick.config.Module
import toothpick.ktp.binding.bind
import toothpick.ktp.binding.toClass

class DatabaseModule : Module() {

    init {
        bind<ContactsDatabase>().toProvider(DatabaseProvider::class.java).providesSingleton()
        bind<ContactDao>().toProvider(ContactDaoProvider::class.java).providesSingleton()
        bind<IContactRepository>().toClass<ContactRepository>().singleton()
    }

}