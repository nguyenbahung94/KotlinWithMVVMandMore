package com.example.nbhung.demoapp.extensions

import android.support.v7.app.AppCompatActivity

fun AppCompatActivity.enableToolbarBackBotton() {
    delegate.supportActionBar?.setDisplayHomeAsUpEnabled(true)
}