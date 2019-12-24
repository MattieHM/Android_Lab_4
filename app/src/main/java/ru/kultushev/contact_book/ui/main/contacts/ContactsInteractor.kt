package ru.kultushev.contact_book.ui.main.contacts

import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import ru.kultushev.contact_book.data.content_provider.IContentProviderRepository
import ru.kultushev.contact_book.data.db.model.Contact
import ru.kultushev.contact_book.data.db.repository.IContactRepository
import toothpick.InjectConstructor

@InjectConstructor
class ContactsInteractor(
    private val contactRepository: IContactRepository,
    private val contentProviderRepository: IContentProviderRepository
) : IContactsInteractor {

    override fun getPhoneContacts(): Maybe<List<String>> {
        return contentProviderRepository.getContactNames()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

    override fun observeDbContacts(): Observable<List<Contact>> {
        return contactRepository.observeContacts()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }


}