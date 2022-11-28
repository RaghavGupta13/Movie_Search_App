package com.example.moviesearch

import android.icu.text.CaseMap.Title

data class Movie(
//    val page: Int,
    val results: List<Result>,
    val total_pages: String,
    val total_results: Int)
