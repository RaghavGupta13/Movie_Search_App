package com.example.moviesearch

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

//https://api.themoviedb.org/3/search/movie?api_key=b9ec1524bdab4b21e25aa0b90373cbfc&language=en-US&query=padmavat&page=1

interface MovieApi {

    @GET("search/movie")
    suspend fun searchMovie(
        @Query("api_key") api: String,
        @Query("query") movieName: String,
        @Query("page") page: Int): Response<Movie>

//    @GET("/movie")
//    suspend fun searchMovie(@Query("api_key") api): Response<List<Movie>>
}