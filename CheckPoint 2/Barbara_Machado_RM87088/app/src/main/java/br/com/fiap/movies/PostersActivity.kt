package br.com.fiap.movies

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.movies.AboutsActivity.Companion.MOVIE_MODEL_KEY
import br.com.fiap.movies.adapter.PosterAdapter
import br.com.fiap.movies.data.MovieData
import br.com.fiap.movies.data.MovieModel
import br.com.fiap.movies.databinding.ActivityPostersBinding

class PostersActivity : AppCompatActivity() {

    lateinit var binding: ActivityPostersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.recyclerViewPosters.adapter = PosterAdapter(
            MovieData.movieList, ::goToAboutsActivity
        )
    }

    private fun goToAboutsActivity(movieModel: MovieModel) {
        startActivity(
            Intent(
                this,
                AboutsActivity::class.java
            ).putExtra(MOVIE_MODEL_KEY, movieModel)
        )
    }
}