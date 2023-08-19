package com.example.moviesFact.components

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.moviesFact.Movie

@Composable
fun ListOfMovies(movies: List<Movie>) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 130.dp),
        content = {
            items(movies) { movie ->
                Movie(movie)
            }
        }
    )
}