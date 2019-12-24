package ru.kultushev.contact_book.util

import ru.kultushev.contact_book.data.db.model.Contact
import ru.kultushev.contact_book.ui.main.contacts.adapters.ContactAdapterModel

fun Contact.toAdapterModel() = ContactAdapterModel(
    id = this.id,
    fullName = "${this.name} ${this.surname} ${this.patronymic}"
)