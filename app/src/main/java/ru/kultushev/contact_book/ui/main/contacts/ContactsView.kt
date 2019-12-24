package ru.kultushev.contact_book.ui.main.contacts

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import ru.kultushev.contact_book.ui.main.contacts.adapters.ContactAdapterModel

interface ContactsView : MvpView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun addDbContacts(contacts: List<ContactAdapterModel>)

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun addPhoneContacts(contacts: List<ContactAdapterModel>)

    @StateStrategyType(SkipStrategy::class)
    fun requestContactPermission()

}