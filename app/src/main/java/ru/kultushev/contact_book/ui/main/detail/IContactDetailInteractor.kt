package ru.kultushev.contact_book.ui.main.detail

import io.reactivex.Maybe
import io.reactivex.Single
import ru.kultushev.contact_book.data.db.model.Contact

interface IContactDetailInteractor {

    fun getContactById(id: Long): Single<Contact>

    fun deleteContact(id: Long): Maybe<Int>

}