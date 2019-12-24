package ru.kultushev.contact_book.ui.main.detail

import io.reactivex.Maybe
import io.reactivex.Single
import ru.kultushev.contact_book.data.db.model.Contact
import ru.kultushev.contact_book.data.db.repository.IContactRepository
import toothpick.InjectConstructor

@InjectConstructor
class ContactDetailInteractor(
    private val contactRepository: IContactRepository
) : IContactDetailInteractor {

    override fun getContactById(id: Long): Single<Contact> {
        return contactRepository.getContactById(id)
    }

    override fun deleteContact(id: Long): Maybe<Int> {
        return contactRepository.deleteContact(id)
    }
}