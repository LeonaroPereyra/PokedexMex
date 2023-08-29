package com.devf.pokedexmex.data.repository.helper

import retrofit2.Retrofit

object RetrofitHelper  {

    fun getRetrofit: Retrofit{
        return Retrofit.Builder().baseUrl()
    }
}