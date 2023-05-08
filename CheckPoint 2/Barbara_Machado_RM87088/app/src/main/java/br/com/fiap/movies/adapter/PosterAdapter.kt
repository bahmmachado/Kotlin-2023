package br.com.fiap.movies.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.movies.R
import br.com.fiap.movies.data.MovieModel
import br.com.fiap.movies.databinding.ViewPosterItemBinding

class PosterAdapter (

    private val movieList: List<MovieModel>,
    private val onCardClick: (MovieModel) -> Unit
): RecyclerView.Adapter<PosterAdapter.PosterViewHolder>() {

    inner class PosterViewHolder(
        itemView: View
    ): RecyclerView.ViewHolder(itemView) {
        private val binding = ViewPosterItemBinding.bind(itemView)

        fun bind(item: MovieModel) {
            binding.posterTitle.text = item.name
            binding.root.setOnClickListener {
                onCardClick.invoke(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PosterViewHolder {
        return PosterViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.view_poster_item, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: PosterViewHolder, position: Int) {
        holder.bind(movieList[position])
   }

    override fun getItemCount(): Int {
        return movieList.size
    }
}