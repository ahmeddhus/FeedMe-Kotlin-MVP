package com.example.feedme.ui.post

import androidx.annotation.StringRes
import com.example.feedme.base.BaseView
import com.example.feedme.model.Post

interface PostView : BaseView {

    fun updatePosts(posts: List<Post>)

    fun showError(error: String)

    fun showError(@StringRes errorResId: Int) {
        this.showError(getContext().getString(errorResId))
    }

    fun showLoading()

    fun hideLoading()
}