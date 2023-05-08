package br.com.fiap.movies.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.movies.R
import br.com.fiap.movies.data.AboutModel
import br.com.fiap.movies.databinding.ViewAboutItemBinding

class AboutAdapter (
    private val aboutList: List<AboutModel>,
    private val theaters: (String) -> Unit
    ): RecyclerView.Adapter<AboutAdapter.AboutViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AboutViewHolder {
        return AboutViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.view_about_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AboutViewHolder, position: Int) {
        holder.bind(aboutList[position])
    }

    override fun getItemCount() = aboutList.size

    inner class AboutViewHolder(
        itemView: View
    ): RecyclerView.ViewHolder(itemView) {
        private val binding = ViewAboutItemBinding.bind(itemView)

        fun bind(item: AboutModel) {
            binding.aboutValue.text = item.sinopsis
            binding.parentalValue.text = item.parentalRating
            binding.genreValue.text = item.genre
            binding.durationValue.text = item.duration
            binding.posterAvailableMessage.isVisible = item.inTheaters
            binding.posterUnavailableMessage.isInvisible = item.inTheaters
            }
        }
    }