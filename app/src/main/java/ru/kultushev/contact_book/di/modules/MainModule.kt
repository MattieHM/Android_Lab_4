package ru.kultushev.contact_book.di.modules

import ru.kultushev.contact_book.ui.main.add.ContactAddInteractor
import ru.kultushev.contact_book.ui.main.add.IContactAddInteractor
import ru.kultushev.contact_book.ui.main.contacts.ContactsInteractor
import ru.kultushev.contact_book.ui.main.contacts.IContactsInteractor
import ru.kultushev.contact_book.ui.main.detail.ContactDetailInteractor
import ru.kultushev.contact_book.ui.main.detail.IContactDetailInteractor
import toothpick.config.Module
import toothpick.ktp.binding.bind
import toothpick.ktp.binding.toClass

class MainModule : Module() {

    init {
        bind<IContactsInteractor>().toClass<ContactsInteractor>().singleton()
        bind<IContactAddInteractor>().toClass<ContactAddInteractor>().singleton()
        bind<IContactDetailInteractor>().toClass<ContactDetailInteractor>().singleton()
    }
}