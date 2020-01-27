package com.example.feedme.injection.component

import com.example.feedme.base.BaseView
import com.example.feedme.injection.module.ContextModule
import com.example.feedme.injection.module.NetworkModule
import com.example.feedme.ui.post.PostPresenter
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = [(ContextModule::class), (NetworkModule::class)])
interface PresenterInjector {

    fun inject(postPresenter: PostPresenter)

    @Component.Builder
    interface Builder{
        fun build(): PresenterInjector

        fun networkModule(networkModule: NetworkModule): Builder
        fun contextModule(contextModule: ContextModule): Builder

        @BindsInstance
        fun baseView(baseView: BaseView): Builder
    }
}