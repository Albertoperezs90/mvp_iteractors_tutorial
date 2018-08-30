package com.tutorial.aperezsi.mvp_simple_tuto.presenters

import com.tutorial.aperezsi.mvp_simple_tuto.contracts.MainContract
import com.tutorial.aperezsi.mvp_simple_tuto.presenters.base.BasePresenter

class MainPresenter(val mainView: MainContract.View) : BasePresenter<MainContract.View>(), MainContract.Presenter {


    override fun attach() {
        view = mainView
    }

    override fun init() {

    }

}