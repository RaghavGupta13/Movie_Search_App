package com.example.moviesearch

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.moviesearch.databinding.FragmentMovieDetailsBinding

class MovieDetailsFragment: Fragment(R.layout.fragment_movie_details) {

    private lateinit var binding: FragmentMovieDetailsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMovieDetailsBinding.bind(view)

        setupLayoutForFragment()

    }

    private fun setupLayoutForFragment(){
        val data = arguments
        binding.idTitle.text = data?.get("title").toString()
        binding.idReleaseDate.text = data?.get("date").toString()
        binding.idVoteCount.text = data?.get("vote_count").toString()
        binding.idOverview.text = data?.get("overview").toString()

        val imageUrl = "https://image.tmdb.org/t/p/w500/${data?.get("poster").toString()}"

        Glide.with(this)
            .load(imageUrl)
            .into(binding.idPoster)

    }
}