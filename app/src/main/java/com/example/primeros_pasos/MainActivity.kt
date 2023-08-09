package com.example.primeros_pasos

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.primeros_pasos.ui.theme.Primeros_PasosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Primeros_PasosTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    UserCard(
                        user = User("enrique", "sfranco", "enrique@gmail.com")
                    )
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

data class User(val name: String, val lastName: String, val email: String)

@Composable
fun UserCard(user: User, modifier: Modifier = Modifier) {
    Row {
        Column {
            Text(
                text = "${user.name} ${user.lastName}",
                modifier = modifier,
                style = TextStyle(
                    color = Color(0XFF4d5499),
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier.height(4.dp))
            Text(text = user.email)
        }
    }
}

// La anotacion @Preview debe usarse en
// funciones que no tengan parametros
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Primeros_PasosTheme {
        UserCard(
            user = User("enrique", "sfranco", "enrique@gmail.com")
        )
    }
}