package com.tutorial.aperezsi.mvp_simple_tuto.presenters

import com.tutorial.aperezsi.mvp_simple_tuto.contracts.SplashContract
import com.tutorial.aperezsi.mvp_simple_tuto.iteractors.SplashIteractor
import com.tutorial.aperezsi.mvp_simple_tuto.model.Discography
import com.tutorial.aperezsi.mvp_simple_tuto.presenters.base.BasePresenter

class SplashPresenter(val splashView: SplashContract.View) : BasePresenter<SplashContract.View>(), SplashContract.Presenter {

    private lateinit var iteractor: SplashIteractor<SplashContract.Presenter>
    private lateinit var discography: Discography


    //ESTO CON INYECCIÓN DE DEPENDENCIAS QUEDARIA MUCHO MAS CORTO Y BONITO PEROOOOOOO....
    override fun attach() {
        view = splashView
        iteractor = SplashIteractor(this)
    }

    override fun init() {
        iteractor.getAlbumsByArtist("coldplay")
    }


    override fun updateAlbumList(albums: Discography) {
        this.discography = albums
        view.goToMainActivity(discography)
    }
}