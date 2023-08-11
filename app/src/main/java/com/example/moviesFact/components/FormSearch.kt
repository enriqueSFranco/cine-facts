package com.example.moviesFact.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormSearch(modifier: Modifier = Modifier, value: String, onChange: (String) -> Unit) {
    Column(modifier) {
        BaseTextField(modifier.fillMaxWidth() ,label = "Buscar pelicula", value, onChange)
    }
}