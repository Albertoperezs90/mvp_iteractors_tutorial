package com.tutorial.aperezsi.mvp_simple_tuto.iteractors

import android.util.Log
import com.tutorial.aperezsi.mvp_simple_tuto.BuildConfig
import com.tutorial.aperezsi.mvp_simple_tuto.contracts.SplashContract
import com.tutorial.aperezsi.mvp_simple_tuto.iteractors.base.BaseIteractor
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class SplashIteractor<P: SplashContract.Presenter>(private val splashPresenter: P) : BaseIteractor<P>() {


    private val service by lazy {
        client.create(SplashService::class.java)
    }

    init {
        super.initService()
    }

    fun getAlbumsByArtist(singer: String){
        service.getAlbumsByArtist(singer)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {
                    result ->
                        presenter.updateAlbumList(result)
                    },
                    { error ->
                        Log.e("error", error.message)
                        presenter.onError()
                    })
    }


    override fun getBaseUrl(): String = BuildConfig.BASE_URL
    override fun getApiKey(): String = BuildConfig.API_KEY
    override fun attachPresenter(): P = splashPresenter

}