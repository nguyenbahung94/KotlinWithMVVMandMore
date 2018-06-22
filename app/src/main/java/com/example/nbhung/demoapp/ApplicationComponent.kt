package com.example.nbhung.demoapp

import com.example.nbhung.demoapp.data.network.NetWorkModule
import com.example.nbhung.demoapp.data.remote.ApiModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        ApplicationModule::class,
        NetWorkModule::class,
        ApiModule::class
))
interface ApplicationComponent {
    //injectors
    fun injectTo(app: MainApplication)

    //submodule methods
    // Every screen is its own submodule of the graph and must be added here.
    fun plus()
}