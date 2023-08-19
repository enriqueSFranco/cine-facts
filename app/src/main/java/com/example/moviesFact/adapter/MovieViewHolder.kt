package com.example.moviesFact.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesFact.Movie
import com.example.primeros_pasos.R

class MovieViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val title = view.findViewById<TextView>(R.id.tvMovie)
    val genre = view.findViewById<TextView>(R.id.tvGenre)
    val cover = view.findViewById<ImageView>(R.id.ivCover)
    fun render (movieModel: Movie) {
        title.text = movieModel.title
        genre.text = movieModel.genre
    }
}