package com.example.nbhung.demoapp.ui.list

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.nbhung.demoapp.ui.base.ActivityModule
import dagger.Module
import dagger.Provides

@Module
class ListModule(activity: AppCompatActivity) : ActivityModule(activity) {
    @Provides
    fun providerLinearLayoutManager(context: Context): LinearLayoutManager = LinearLayoutManager(context)
}