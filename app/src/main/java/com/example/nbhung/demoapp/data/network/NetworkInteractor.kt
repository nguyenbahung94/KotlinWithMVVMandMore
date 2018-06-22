package com.example.nbhung.demoapp.data.network

import io.reactivex.Completable

interface NetworkInteractor {
    fun hasNetWorkConnection(): Boolean

    fun hasNetWorkConnectionCompletable(): Completable

    class NetWorkUnavailableException : Throwable("No network available!")
}