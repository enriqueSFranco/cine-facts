package com.example.moviesFact

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviesFact.ui.theme.Primeros_PasosTheme
import com.example.primeros_pasos.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // todo lo que se encuantre dentro de setContent serán elementos composable
            MainApp()
        }
        Log.d("MainActivity", "onCreate: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy: ")
    }
}

@Composable
private fun MainApp() {
    Primeros_PasosTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colorScheme.background) {
            ViewContainer()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Toolbar() {
    TopAppBar(
        title = { Text(text = "Profile") },
    )
}

@Composable
private fun FAB() {
    val ctx = LocalContext.current

    FloatingActionButton(onClick = {
        Toast.makeText(ctx, "HELLO WORLD", Toast.LENGTH_SHORT).show()
    }, modifier = Modifier.size(width = 50.dp, height = 50.dp).clip(CircleShape)) {
        Icon(
            painter = painterResource(id = R.drawable.ic_add),
            contentDescription = "button to show alert",
            modifier = Modifier.size(width = 40.dp, height = 40.dp)
        )
    }
}

@Composable
private fun CustomContent(padding: PaddingValues) {
    var likes by rememberSaveable { mutableStateOf(0) }
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceTint,
        ),
        modifier = Modifier
            .size(width = 200.dp, height = 240.dp)
            .padding(padding)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_user),
                contentDescription = "user defautl image",
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier
                    .size(64.dp)
                    .fillMaxWidth()
            )
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.ic_heart),
                    contentDescription = "like button",
                    colorFilter = ColorFilter.tint(Color.White),
                    modifier = Modifier
                        .size(24.dp)
                        .clickable { likes++ }
                )
                Text(text = likes.toString(), color = Color.White)
            }
            Text(
                text = "¡Hello kike 👋!",
                color = Color.White,
                textAlign = TextAlign.Left,
                modifier = Modifier.fillMaxWidth()
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Typescript", color = Color.White)
                Text(text = "Java", color = Color.White)
                Text(text = "Kotlin", color = Color.White)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
private fun ViewContainer() {
    Scaffold(
        topBar = { Toolbar() },
        content = { padding -> CustomContent(padding) },
        floatingActionButton = { FAB() })
}