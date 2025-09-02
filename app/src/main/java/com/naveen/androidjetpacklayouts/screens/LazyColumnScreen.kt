package com.naveen.androidjetpacklayouts.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnScreen() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)
            .padding(10.dp)
            .background(Color.White)
            .padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)

    ) {

        item {
            Text(text = "First item")
        }

        // Add 5 items
        items(50) { index ->
            Text(text = "Item: $index")
        }

        // Add another single item
        item {
            Text(text = "Last item")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LazyColumnScreenPreview(){
    LazyColumnScreen()
}