package ru.kultushev.contact_book.ui.main.contacts.adapters

data class ContactAdapterModel(
    val id: Long = -1,
    val fullName: String,
    val isContact: Boolean = false
)