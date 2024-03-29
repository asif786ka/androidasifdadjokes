package com.asifmvvm.dadjokes.network

import com.asifmvvm.dadjokes.network.JokeModel
import retrofit2.http.GET
import retrofit2.http.Headers

interface JokesApi {
    @Headers(
        "Accept: application/json",
        "User-Agent: Dad-Joke-Sample-App"
    )
    @GET("/")
    suspend fun getRandomJoke(): JokeModel
}