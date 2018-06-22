package com.example.nbhung.demoapp.ui.detail

import android.support.v7.app.AppCompatActivity
import com.example.nbhung.demoapp.data.remote.model.Repos
import com.example.nbhung.demoapp.ui.base.ActivityModule
import dagger.Module
import dagger.Provides

@Module
class DetailModule(activity: AppCompatActivity, val repos: Repos) : ActivityModule(activity) {
    @Provides
    fun provideRepo(): Repos = repos
}