package com.example.nbhung.demoapp.ui.list

import com.example.nbhung.demoapp.data.remote.model.Repos
import com.example.nbhung.demoapp.ui.base.AbstractViewModel
import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

class RepoViewModel(val repos: Repos) : AbstractViewModel() {
    private val clicks = PublishSubject.create<Unit>()
    fun getName() = repos.fullName
    fun getDescription() = repos.description
    fun onclick() {
        clicks.onNext(Unit)
    }

    fun clicks(): Observable<Unit> = clicks.hide()
}