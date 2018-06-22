package com.example.nbhung.demoapp.ui.detail

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.os.PersistableBundle
import com.example.nbhung.demoapp.ApplicationComponent
import com.example.nbhung.demoapp.data.remote.model.Repos
import com.example.nbhung.demoapp.extensions.enableToolbarBackBotton
import com.example.nbhung.demoapp.ui.base.ViewModelActivity
import com.example.nbhung.kotlinwithmvvm.R
import com.example.nbhung.kotlinwithmvvm.databinding.ActivityDetailBinding

open class DetailActivity : ViewModelActivity<DetailViewModel, ActivityDetailBinding>() {
    companion object {
        val EXTRA_REPO_OBJECT = "REPO_ITEM"
        fun newIntent(context: Context, repos: Repos): Intent {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(EXTRA_REPO_OBJECT, repos)
            return intent
        }
    }

    private val repos by lazy { intent.getParcelableExtra<Repos>(EXTRA_REPO_OBJECT) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(binding.detailToolbar)
        enableToolbarBackBotton()
    }

    override fun onBind() {
        super.onBind()
        binding.viewModel = viewModel
    }

    override fun injectDependencies(graph: ApplicationComponent) {
    }

    override fun getViewBinding(): ActivityDetailBinding {
        return DataBindingUtil.setContentView(this, R.layout.activity_detail)
    }
}