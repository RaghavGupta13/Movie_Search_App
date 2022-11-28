package com.example.moviesearch

data class Result(
    val overview: String,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val vote_count: Int
)