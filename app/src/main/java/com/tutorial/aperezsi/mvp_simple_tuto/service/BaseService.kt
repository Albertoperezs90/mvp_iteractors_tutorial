package com.tutorial.aperezsi.mvp_simple_tuto.service

import com.tutorial.aperezsi.mvp_simple_tuto.BuildConfig
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

abstract class BaseService {

    fun createRetrofitClient() : Retrofit {
        val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(getBaseUrl() + getApiKey())
                .build()

        return retrofit
    }

    abstract fun getApiKey(): String
    abstract fun getBaseUrl(): String
    abstract fun initService()
}