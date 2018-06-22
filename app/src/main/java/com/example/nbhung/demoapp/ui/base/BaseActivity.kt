package com.example.nbhung.demoapp.ui.base

import android.app.Application
import android.os.Bundle
import android.os.PersistableBundle
import android.support.annotation.CallSuper
import android.support.v4.widget.DirectedAcyclicGraph
import android.support.v7.app.AppCompatActivity
import com.example.nbhung.demoapp.ApplicationComponent

abstract class BaseActivity : AppCompatActivity() {
    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    abstract fun injectDependencies(graph: ApplicationComponent)
}