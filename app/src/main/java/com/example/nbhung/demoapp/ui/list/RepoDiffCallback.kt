package com.example.nbhung.demoapp.ui.list

import android.support.v7.util.DiffUtil
import com.example.nbhung.demoapp.data.remote.model.Repos

class RepoDiffCallback(private val old: List<Repos>, private val new: List<Repos>) : DiffUtil.Callback() {
    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return old[oldItemPosition].fullName == new[newItemPosition].fullName
    }

    override fun getNewListSize(): Int {
        return new.size
    }

    override fun getOldListSize(): Int {
        return old.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
       return old[oldItemPosition]==new[newItemPosition]
    }
}