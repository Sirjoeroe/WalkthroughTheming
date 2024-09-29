package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    var text by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Otsikko",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        OutlinedTextField(
            value = "text",
            onValueChange = { text = it },
            label = { Text("Syötä tekstiä") },
            modifier = Modifier.padding(bottom = 16.dp).fillMaxWidth()
        )
        Button(
            onClick = { /* Toiminnallisuus napin painallukselle */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Nappi")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    MyAppTheme {
        MyApp()
    }
}
