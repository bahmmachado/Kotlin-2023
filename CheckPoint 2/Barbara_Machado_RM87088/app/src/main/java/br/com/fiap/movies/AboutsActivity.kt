package br.com.fiap.movies

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.movies.adapter.AboutAdapter
import br.com.fiap.movies.data.MovieModel
import br.com.fiap.movies.databinding.ActivityAboutsBinding

class AboutsActivity : AppCompatActivity() {

    lateinit var binding: ActivityAboutsBinding
    private val movieModel by lazy {
        intent.extras?.getSerializable(MOVIE_MODEL_KEY) as MovieModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecyclerView()
        binding.textInputEditTextPoster.setText(movieModel.name)
    }

    private fun setupRecyclerView() {
        movieModel?.abouts?.let {
            binding.recyclerViewAbouts.adapter = AboutAdapter(
                it,
                ::callImplicitIntent
            )
        }
    }

    private fun callImplicitIntent(messageValue: String) {
        messageValue.apply {
            getString(R.string.poster_unavailable_message_label)
        }
        }

    companion object {
        const val MOVIE_MODEL_KEY = "MOVIE_MODEL_KEY"
    }

    }