package com.example.moviesFact.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesFact.Movie
import com.example.primeros_pasos.R

class MovieAdapter(private val movies: List<Movie>): RecyclerView.Adapter<MovieViewHolder>() {
    // sobreescribimos los métodos de la clase RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = movies.size
}