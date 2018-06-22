package com.example.nbhung.demoapp.ui.detail

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.example.nbhung.demoapp.extensions.loadImage

@BindingAdapter("android:src")
fun setImageBinding(view: ImageView, url: String) {
    view.loadImage(url)
}