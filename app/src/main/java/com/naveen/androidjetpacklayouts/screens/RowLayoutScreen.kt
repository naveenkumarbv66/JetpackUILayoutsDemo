package com.naveen.androidjetpacklayouts.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
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
fun RowLayoutScreen() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("Row arranges children horizontally:")
        Text("First")
        Text("Second")
    }
}

@Composable
fun TestTwoRowLayoutScreen() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding(8.dp)
            .background(Color.Cyan)
            .padding(6.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.End),
        verticalAlignment = Alignment.Bottom
    ) {
        Text("First")
        Text("Second")
        Text("Three")
    }
}

@Composable
fun TestThreeRowLayoutScreen() {
    Row(
        modifier = Modifier
            .fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
       Surface(
           modifier = Modifier
               .height(50.dp)
               .width(100.dp),
           color = Color.Blue
       ) { }

        Surface(
            modifier = Modifier
                .height(50.dp)
                .width(100.dp),
            color = Color.Blue
        ) { }

        Surface(
            modifier = Modifier
                .height(50.dp)
                .width(100.dp),
            color = Color.Blue
        ) { }
    }
}

@Composable
fun TestFourRowLayoutScreen() {
    Row(
        modifier = Modifier
            .fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Surface(
            modifier = Modifier
                .height(50.dp)
                .width(100.dp)
                .weight(3f),
            color = Color.Blue
        ) { }

        Surface(
            modifier = Modifier
                .height(50.dp)
                .width(100.dp)
                .weight(2f),
            color = Color.Black
        ) { }

        Surface(
            modifier = Modifier
                .height(50.dp)
                .width(100.dp)
                .weight(1f),
            color = Color.Red
        ) { }
    }
}


@Preview(showBackground = true)
@Composable
fun RowLayoutScreenPreview(){
    TestFourRowLayoutScreen()
}
