package com.example.nbhung.demoapp

import android.app.Application

class MainApplication : Application() {

    companion object {
        lateinit var graph: ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()
        initDependencyGraph()

    }

    private fun initDependencyGraph() {
        graph = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
        graph.injectTo(this)
    }
}