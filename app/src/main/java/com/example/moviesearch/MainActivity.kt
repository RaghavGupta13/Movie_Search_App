package com.example.moviesearch

import android.app.FragmentManager
import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.example.moviesearch.databinding.ActivityMainBinding
import okhttp3.Response
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.idToolbar.title = "Movie Search"
//        setSupportActionBar(binding.idToolbar)
        setupSearchButton()
        //setupBackButton()

    }

    private fun setupSearchButton(){

        binding.idSearchBtn.setOnClickListener {

            //The Linear layout will get invisible once we have fragment in foreground
            //binding.idLinearLayout.isVisible = false

            if(binding.idMovieSearchEt.text.toString() != null){
                fetchMovieData()
            }


        }
    }

//    private fun setupBackButton(){
//
//        binding.idBackBtn.setOnClickListener {
//            supportFragmentManager.beginTransaction()
//                .remove(MovieDetailsFragment())
//                .commit()
//        }
//    }


    private fun fetchMovieData() {
//        val apiKey = BuildConfig.API_KEY
//
//        lifecycleScope.launchWhenCreated {
//            try{
//                val response = RetrofitInstance.api.searchMovie(apiKey,
//                binding.idMovieSearchEt.text.toString(),
//                    1)
//
//                if(response.isSuccessful){
//                    Log.d(TAG, "fetchMovieData: ${response.body()?.results?.get(0).toString()}")
//
//                    val movieDetailsFrag = MovieDetailsFragment()
//                    val fragmentTransaction = supportFragmentManager.beginTransaction()
//
//                    val mBundle = Bundle()
//
//                    //Putting all the data that we need to send to fragment
//                    mBundle.putString("title", response.body()?.results?.get(0)?.title)
//                    mBundle.putString("overview", response.body()?.results?.get(0)?.overview)
//                    mBundle.putString("date", response.body()?.results?.get(0)?.release_date)
//                    mBundle.putString("poster", response.body()?.results?.get(0)?.poster_path)
//                    mBundle.putInt("vote_count", response.body()?.results?.get(0)?.vote_count!!)
//
//                    movieDetailsFrag.arguments = mBundle
//                    fragmentTransaction.replace(R.id.id_fragment_container, movieDetailsFrag).commit()
//                    //supportFragmentManager.popBackStack("FragA", FragmentManager.POP_BACK_STACK_INCLUSIVE)
//
//                }else{
//                    Log.d(TAG, "fetchMovieData: ${response.body().toString()}")
//                    Toast.makeText(this@MainActivity, "fail", Toast.LENGTH_SHORT).show()
//                }
//
//            }catch (e: Exception){
//                Log.d(TAG, "fetchMovieData: ${e.localizedMessage.toString()}")
//                Toast.makeText(this@MainActivity, "abc", Toast.LENGTH_SHORT).show()
//            }
//
//        }
    }



}