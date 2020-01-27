package com.example.feedme.base

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.feedme.R

abstract class BaseActivity<P : BasePresenter<BaseView>> : BaseView, AppCompatActivity() {

    protected lateinit var presenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        presenter = instantiatePresenter()
    }

    protected abstract fun instantiatePresenter(): P

    override fun getContext(): Context {
        return this
    }
}
