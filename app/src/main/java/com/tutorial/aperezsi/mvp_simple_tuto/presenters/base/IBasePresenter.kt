package com.tutorial.aperezsi.mvp_simple_tuto.presenters.base

import com.tutorial.aperezsi.mvp_simple_tuto.views.base.BaseView

interface IBasePresenter {

    fun attach()
    fun init()
    fun onError()
}