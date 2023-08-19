package com.example.moviesFact.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.moviesFact.Movie

@Composable
fun Movie (movie: Movie) {
    Box(modifier = Modifier
        .padding(8.dp)
        .aspectRatio(1f)
        .clip(RoundedCornerShape(5.dp))) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(movie.title)
            Spacer(modifier = Modifier.height(4.dp))
            Text(movie.genre)
        }
    }
}