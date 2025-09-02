package com.naveen.androidjetpacklayouts.screens

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.naveen.androidjetpacklayouts.ui.theme.AndroidJetpackLayoutsTheme

@Composable
fun HomeScreen(
    description: String,
    onOpenColumn: () -> Unit,
    onOpenRow: () -> Unit,
    onOpenBox: () -> Unit,
    onOpenLazyColumn: () -> Unit,
    onOpenLazyRow: () -> Unit,
    onOpenLazyVerticalGrid: () -> Unit,
    onOpenLazyHorizontalGrid: () -> Unit,
    onOpenLazyStaggeredGrid: () -> Unit,
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Demo layouts",
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = description,
            style = MaterialTheme.typography.bodyMedium
        )
        Button(onClick = onOpenColumn) { Text("Column") }
        Button(onClick = onOpenRow) { Text("Row") }
        Button(onClick = onOpenBox) { Text("Box") }

        Button(onClick = onOpenLazyColumn) { Text("Lazy Column") }
        Button(onClick = onOpenLazyRow) { Text("Lazy Row") }
        Button(onClick = onOpenLazyVerticalGrid) { Text("Lazy Vertical Grid") }
        Button(onClick = onOpenLazyHorizontalGrid) { Text("Lazy Horizontal Grid") }
        Button(onClick = onOpenLazyStaggeredGrid) { Text("Lazy Staggered Grid") }

    }
}

@Preview(showBackground = true)
@Composable
private fun HomePreview() {
    AndroidJetpackLayoutsTheme { HomeScreen("Preview", {}, {}, {}, {}, {}, {}, {}, {}) }
}
