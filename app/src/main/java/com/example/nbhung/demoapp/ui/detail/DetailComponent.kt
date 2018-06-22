package com.example.nbhung.demoapp.ui.detail

import com.example.nbhung.demoapp.ui.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = arrayOf(
        DetailComponent::class
))
interface DetailComponent {
    fun injectTo(activity: DetailActivity)
}