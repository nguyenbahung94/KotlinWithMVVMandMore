package com.example.nbhung.demoapp.ui.detail

import com.example.nbhung.demoapp.data.remote.model.Repos
import com.example.nbhung.demoapp.ui.base.AbstractViewModel
import javax.inject.Inject

class DetailViewModel @Inject constructor(val repos: Repos) : AbstractViewModel() {
    fun getName() = repos.fullName
    fun getDescription() = repos.description
    fun getStars() = repos.stars.toString()
    fun getForks() = repos.forks.toString()
    fun getAvatarURl() = repos.owner.avatarUrl
}