package com.tutorial.aperezsi.mvp_simple_tuto.iteractors

import com.tutorial.aperezsi.mvp_simple_tuto.model.Discography
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface SplashService {

    @GET("searchalbum.php")
    fun getAlbumsByArtist(@Query("s") singer: String) : Observable<Discography>
}