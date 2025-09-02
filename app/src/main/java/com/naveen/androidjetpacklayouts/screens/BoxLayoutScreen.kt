package com.naveen.androidjetpacklayouts.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
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


@Composable
fun BoxLayoutTwoScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.Gray)
    ) {
        Surface(
            modifier = Modifier
                .height(50.dp)
                .width(100.dp)
                .align(Alignment.Center),
            color = Color.Red
        ) { }

        Surface(
            modifier = Modifier
                .height(50.dp)
                .width(100.dp)
                .align(Alignment.TopEnd),
            color = Color.Cyan
        ) { }

        Surface(
            modifier = Modifier
                .height(50.dp)
                .width(100.dp)
                .align(Alignment.BottomStart),
            color = Color.Blue
        ) { }
    }
}


@Preview(showBackground = true)
@Composable
fun BoxLayoutScreenDemo(){
    BoxLayoutTwoScreen()
}