package com.naveen.androidjetpacklayouts.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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

@Composable
fun BoxLayoutThreeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {

        Box(modifier = Modifier.height(100.dp).width(150.dp).background(Color.Blue)) {
            Text(text ="The text inside box.", fontSize = 40.sp, color = Color.White )
        }

       Text(text ="Hey I am text...", fontSize = 40.sp, color = Color.Red )

    }
}

@Composable
fun BoxLayoutFourScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {

        Box(modifier = Modifier.height(100.dp).width(150.dp).background(Color.Blue)) {
            Text(text ="The text inside box.", fontSize = 40.sp, color = Color.White )
        }

        Text(text ="Hey I am text...", fontSize = 40.sp, color = Color.Red )

        Text(text ="align text bottom", fontSize = 40.sp, color = Color.Cyan, modifier = Modifier.align(Alignment.BottomStart) )

    }
}

@Composable
fun BoxLayoutFiveScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        contentAlignment = Alignment.Center
    ) {

        Box(modifier = Modifier.height(100.dp).width(150.dp).background(Color.Blue)) {
            Text(text ="The text inside box.", fontSize = 40.sp, color = Color.White )
        }

        Text(text ="Hey I am text...", fontSize = 40.sp, color = Color.Red )

        Text(text ="align text bottom", fontSize = 20.sp, color = Color.Cyan, modifier = Modifier.align(Alignment.BottomStart) )

    }
}

@Composable
fun BoxLayoutSixScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        contentAlignment = Alignment.Center
    ) {

        Box(modifier = Modifier.height(100.dp).width(150.dp).background(Color.Blue).verticalScroll(rememberScrollState())) {
            Text(text ="The text inside box.", fontSize = 60.sp, color = Color.White )
        }

        Text(text ="align text bottom", fontSize = 20.sp, color = Color.Cyan, modifier = Modifier.align(Alignment.BottomStart) )

    }
}

@Composable
fun BoxLayoutSevenScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        contentAlignment = Alignment.TopCenter
    ) {

        Box(modifier = Modifier.height(50.dp).background(Color.Blue).verticalScroll(rememberScrollState())){
            Text(text ="Hey I am text...", fontSize = 25.sp, color = Color.Red, modifier = Modifier.background(Color.White) )
        }

        Text(text ="align text bottom", fontSize = 20.sp, color = Color.Cyan, modifier = Modifier.align(Alignment.BottomStart).background(Color.Magenta) )

    }
}


@Preview(showBackground = true)
@Composable
fun BoxLayoutScreenDemo(){
    BoxLayoutSevenScreen()
}