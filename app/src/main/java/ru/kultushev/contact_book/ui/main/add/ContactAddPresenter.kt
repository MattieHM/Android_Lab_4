package ru.kultushev.contact_book.ui.main.add

import com.arellomobile.mvp.InjectViewState
import io.reactivex.rxkotlin.addTo
import ru.kultushev.contact_book.data.db.model.Contact
import ru.kultushev.contact_book.ui.common.BasePresenter
import ru.terrakok.cicerone.Router

@InjectViewState
class ContactAddPresenter (
    private val contactAddInteractor: IContactAddInteractor,
    private val router: Router
) : BasePresenter<ContactAddView>() {

    fun addContact(name: String, surname: String, patronymic: String, phone: String, email: String) {
        val newId = arrayOf(name, surname, patronymic, phone, email)
            .map { it.hashCode().toLong() }
            .sum()

        contactAddInteractor.addContact(Contact(
            id = newId,
            name = name,
            surname = surname,
            patronymic = patronymic,
            phone = phone,
            email = email
        )).subscribe {
            viewState.showToast("Контакт был успешно добавлен")
        }.addTo(compositeDisposable)
    }

    fun onBackPressed() {
        router.exit()
    }

}