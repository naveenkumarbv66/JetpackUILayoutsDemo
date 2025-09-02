package com.naveen.androidjetpacklayouts.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ColumnLayoutScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text("Column arranges children vertically:")
        Text("First item")
        Text("Second item")
    }
}

@Preview(showBackground = true)
@Composable
private fun ColumnLayoutScreenPreview() {
    ColumnLayoutScreen()
}
