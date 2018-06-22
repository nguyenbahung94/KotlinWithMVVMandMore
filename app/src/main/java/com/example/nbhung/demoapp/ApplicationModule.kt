package com.example.nbhung.demoapp

import android.app.Application
import android.content.Context
import android.content.res.Resources
import android.view.LayoutInflater
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val app: MainApplication) {
    @Provides
    @Singleton
    fun provideApplication(): Application = app

    @Provides
    @Singleton
    @ApplicationQualifier
    fun provideContext(): Context = app.baseContext

    @Provides
    @Singleton
    fun provideResource(): Resources = app.resources

    @Provides
    @Singleton
    fun provideLayoutInflateer(@ApplicationQualifier context: Context): LayoutInflater {
        return LayoutInflater.from(context)
    }
}