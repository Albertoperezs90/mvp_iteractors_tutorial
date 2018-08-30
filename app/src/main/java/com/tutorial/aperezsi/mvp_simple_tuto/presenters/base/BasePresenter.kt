package com.tutorial.aperezsi.mvp_simple_tuto.presenters.base

import com.tutorial.aperezsi.mvp_simple_tuto.views.base.BaseView

abstract class BasePresenter<V: BaseView> : IBasePresenter {

    protected lateinit var view : V

    //ESTO CON INYECCIÓN DE DEPENCIAS QUEDARIA MAS ELEGANTE


    override fun onError() {
        view.showErrorDialog()
    }
}