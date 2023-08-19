package com.example.moviesFact

class MoviesProvider {
    companion object {
         val movies: List<Movie> = listOf(
            Movie("Spider Man", "Ciencia Ficción"),
            Movie("Avengers",  "Ciencia Ficción"),
            Movie("Jhon Wick",  "Acción"),
        )
    }
}