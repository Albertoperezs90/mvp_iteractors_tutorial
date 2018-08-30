package com.tutorial.aperezsi.mvp_simple_tuto.views

import android.content.Intent
import com.tutorial.aperezsi.mvp_simple_tuto.R
import com.tutorial.aperezsi.mvp_simple_tuto.contracts.SplashContract
import com.tutorial.aperezsi.mvp_simple_tuto.model.Discography
import com.tutorial.aperezsi.mvp_simple_tuto.presenters.SplashPresenter
import com.tutorial.aperezsi.mvp_simple_tuto.views.base.BaseActivity

class SplashActivity : BaseActivity<SplashContract.Presenter>(), SplashContract.View {


    //----------------PUBLIC METHODS--------------------

    override fun goToMainActivity(discography: Discography) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("discography", discography)
        startActivity(intent)
    }


    //----------------PROTECTED METHODS--------------------

    override fun attach(): SplashContract.Presenter = SplashPresenter(this)
    override fun getLayout(): Int = R.layout.activity_splash
}
