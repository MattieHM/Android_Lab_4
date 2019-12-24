package ru.kultushev.contact_book.ui.main.contacts.adapters

import androidx.recyclerview.widget.DiffUtil

class ContactsDiffCallback(
    private val oldList: List<ContactAdapterModel>,
    private val newList: List<ContactAdapterModel>
) : DiffUtil.Callback() {

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }

    override fun getOldListSize() = oldList.size

    override fun getNewListSize() = newList.size
}