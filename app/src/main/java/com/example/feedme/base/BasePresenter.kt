package com.example.feedme.base

import com.example.feedme.injection.component.PresenterInjector
import com.example.feedme.injection.component.PresenterInjector.Builder
import com.example.feedme.injection.module.ContextModule
import com.example.feedme.injection.module.NetworkModule
import com.example.feedme.ui.post.PostPresenter

abstract class BasePresenter<out V : BaseView>(protected val view: V) {

    private val injector: PresenterInjector = Builder
        .builder()
        .baseView(view)
        .contextModule(ContextModule)
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    open fun onViewCreated() {

    }

    open fun onViewDestroyed() {

    }

    private fun inject() {
        when (this) {
            is PostPresenter -> injector.inject(this)
        }
    }
}