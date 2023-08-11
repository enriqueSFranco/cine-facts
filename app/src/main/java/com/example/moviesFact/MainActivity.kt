package com.example.moviesFact

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviesFact.components.BaseButton
import com.example.moviesFact.components.FormSearch
import com.example.moviesFact.ui.theme.Primeros_PasosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /*
            * todo lo que se encuantre dentro de setContent serán elementos composable
            * */
            Primeros_PasosTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Content()
                }
            }
        }
        Log.d("MainActivity", "onCreate: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy: ")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Content() {
    var movie by rememberSaveable { mutableStateOf("") }
    
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(title = { Text("MoviesFact") } )
        }
    ) { paddingValues ->
        Column(modifier = Modifier
            .padding(paddingValues)
            .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            FormSearch(value = movie, onChange = {movie = it})

            BaseButton(text = "Buscar") {
                // click
            }
        }
    }
}

// La anotacion @Preview debe usarse en
// funciones que no tengan parametros
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Primeros_PasosTheme {
        Content()
    }
}