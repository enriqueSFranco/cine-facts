package com.example.moviesFact.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BaseButton (text: String, handleClick: () -> Unit) {
    Button(onClick = handleClick, modifier = Modifier.fillMaxWidth()) {
        Text(text)
    }
}