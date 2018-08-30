package com.tutorial.aperezsi.mvp_simple_tuto.contracts

import com.tutorial.aperezsi.mvp_simple_tuto.model.Discography
import com.tutorial.aperezsi.mvp_simple_tuto.presenters.base.IBasePresenter
import com.tutorial.aperezsi.mvp_simple_tuto.views.base.BaseView
import okhttp3.ResponseBody

interface SplashContract {


    interface View : BaseView{
        fun goToMainActivity(discography: Discography)
    }


    interface Presenter : IBasePresenter {
        fun updateAlbumList(albums: Discography)
    }
}