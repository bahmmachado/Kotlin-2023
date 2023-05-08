package br.com.fiap.movies.data

data class MovieModel(
  val name: String,
  val abouts: List<AboutModel>
): java.io.Serializable

data class AboutModel(
    val sinopsis: String,
    val parentalRating: String,
    val genre: String,
    val duration: String,
    val inTheaters: Boolean = false,
) : java.io.Serializable