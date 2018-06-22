package com.example.nbhung.demoapp.data.network

import android.content.Context
import android.net.ConnectivityManager
import com.example.nbhung.demoapp.ApplicationQualifier
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NetWorkModule {
    @Provides
    @Singleton
    fun provideConnectivityManager(@ApplicationQualifier context: Context): ConnectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    @Provides
    @Singleton
    fun provideNetWorkInteractor(networkInteractorImpl: NetworkInteractorImpl): NetworkInteractor = networkInteractorImpl
}