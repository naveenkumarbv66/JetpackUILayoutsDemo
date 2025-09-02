package com.naveen.androidjetpacklayouts.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    description: String,
    onOpenColumn: () -> Unit,
    onOpenRow: () -> Unit,
    onOpenBox: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
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
    }
}
