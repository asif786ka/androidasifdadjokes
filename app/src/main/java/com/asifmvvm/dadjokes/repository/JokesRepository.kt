package com.asifmvvm.dadjokes.repository

import com.asifmvvm.dadjokes.network.JokeModel
import com.asifmvvm.dadjokes.network.JokesApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class JokesRepository @Inject constructor(private val jokesApi: JokesApi) {

    suspend fun getRandomJoke() : JokeModel {
        return jokesApi.getRandomJoke()
    }
}