package com.naveen.androidjetpacklayouts.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

@Composable
fun TestColumnScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
            .background(Color.LightGray)
            .padding(18.dp)
           .background(Color.Gray),
        verticalArrangement = Arrangement.spacedBy(40.dp)
    ) {
        Text("Column arranges children vertically:", color = Color.Red)
        Text("First item", color = Color.Red)
        Text("Second item", color = Color.Red)
    }
}

@Composable
fun TestTwoColumnScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
            .background(Color.LightGray)
            .padding(18.dp)
            .background(Color.Gray),
        verticalArrangement = Arrangement.spacedBy(40.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.End,
    ) {
        Text("Column arranges children vertically:", color = Color.Red)
        Text("First item", color = Color.Red)
        Text("Second item", color = Color.Red)
    }
}

@Preview(showBackground = true)
@Composable
private fun ColumnLayoutScreenPreview() {
    TestTwoColumnScreen()
}
