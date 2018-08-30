package com.tutorial.aperezsi.mvp_simple_tuto.views.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tutorial.aperezsi.mvp_simple_tuto.R
import com.tutorial.aperezsi.mvp_simple_tuto.presenters.base.IBasePresenter
import com.tutorial.aperezsi.mvp_simple_tuto.utils.DialogManager

abstract class BaseActivity<P: IBasePresenter> : AppCompatActivity(), BaseView {

    protected lateinit var presenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out)
        presenter = attach()
        presenter.attach()
        presenter.init()
    }

    override fun onResume() {
        super.onResume()
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out)
    }

    override fun showProgressDialog() {
        DialogManager.showProgressDialog(this)
    }


    override fun hideProgressDialog() {
        DialogManager.hideProgressDialog()
    }


    override fun showErrorDialog() {
        DialogManager.showErrorDialog(this)
    }

    abstract fun getLayout(): Int
    abstract fun attach() : P
}