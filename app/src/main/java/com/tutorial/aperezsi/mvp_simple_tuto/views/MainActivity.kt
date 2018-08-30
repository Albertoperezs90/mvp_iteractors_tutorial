package com.tutorial.aperezsi.mvp_simple_tuto.views

import android.os.Bundle
import android.util.Log
import com.tutorial.aperezsi.mvp_simple_tuto.R
import com.tutorial.aperezsi.mvp_simple_tuto.contracts.MainContract
import com.tutorial.aperezsi.mvp_simple_tuto.presenters.MainPresenter
import com.tutorial.aperezsi.mvp_simple_tuto.views.base.BaseActivity

class MainActivity : BaseActivity<MainContract.Presenter>(), MainContract.View {

    //--------------------------------LIFECYCLE------------------------------




    //--------------------------------PUBLIC METHODS----------------------------

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val list = intent.getSerializableExtra("discography")
    }

    //--------------------------------PROTECTED METHODS---------------------------

    override fun getLayout(): Int = R.layout.activity_main
    override fun attach(): MainContract.Presenter = MainPresenter(this)
}