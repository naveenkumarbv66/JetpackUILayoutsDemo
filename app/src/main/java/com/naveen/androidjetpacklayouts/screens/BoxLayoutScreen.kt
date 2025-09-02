package com.naveen.androidjetpacklayouts.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BoxLayoutScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Box stacks children; align them freely.",
            modifier = Modifier.align(Alignment.TopStart)
        )
        Text(
            text = "Top End",
            modifier = Modifier.align(Alignment.TopEnd)
        )
        Text(
            text = "Center",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}