package com.tutorial.aperezsi.mvp_simple_tuto.iteractors.base

import com.tutorial.aperezsi.mvp_simple_tuto.presenters.base.BasePresenter
import com.tutorial.aperezsi.mvp_simple_tuto.presenters.base.IBasePresenter
import com.tutorial.aperezsi.mvp_simple_tuto.service.BaseService
import retrofit2.Retrofit

abstract class BaseIteractor<P: IBasePresenter> : BaseService() {

    protected lateinit var client: Retrofit
    protected lateinit var presenter: P

    override fun initService() {
        this.presenter = attachPresenter()
        client = super.createRetrofitClient()
    }

    abstract fun attachPresenter() : P
}