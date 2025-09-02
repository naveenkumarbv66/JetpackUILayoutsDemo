package com.naveen.androidjetpacklayouts

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.naveen.androidjetpacklayouts.ui.theme.AndroidJetpackLayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidJetpackLayoutsTheme { MainScreen(openDemo = { openLayoutDemo() }) }
        }
    }
}

private fun MainActivity.openLayoutDemo() {
    startActivity(Intent(this, LayoutDemo::class.java))
}

@Composable
private fun MainScreen(openDemo: () -> Unit) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Jetpack Compose MVVM Layouts Demo",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Explore core layouts (Column, Row, Box) with a simple MVVM setup and Navigation Compose for transitions.",
                style = MaterialTheme.typography.bodyMedium
            )
            Button(onClick = openDemo) {
                Text("Open Layout Demo")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MainPreview() {
    AndroidJetpackLayoutsTheme { MainScreen(openDemo = {}) }
}