package com.example.nbhung.demoapp.data.network

import android.net.ConnectivityManager
import io.reactivex.Completable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkInteractorImpl @Inject constructor(
        private val connectivityManager: ConnectivityManager
) : NetworkInteractor {
    override fun hasNetWorkConnectionCompletable(): Completable =
            if (hasNetWorkConnection()) {
                Completable.complete()
            } else {
                Completable.error { NetworkInteractor.NetWorkUnavailableException() }
            }

    override fun hasNetWorkConnection(): Boolean = connectivityManager.activeNetworkInfo?.isConnectedOrConnecting
            ?: false
}