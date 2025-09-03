package com.naveen.androidjetpacklayouts.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun LazyVerticalGridScreen(){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(100){ index ->
            CustomCard(index.toString())
        }
    }
}

@Composable
fun LazyVerticalGridAdaptiveScreen(){
    LazyVerticalGrid(
        columns = GridCells.Adaptive(60.dp),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(100){ index ->
            CustomCard(index.toString())
        }
    }
}

@Composable
fun LazyVerticalGridFixedSizeScreen(){
    LazyVerticalGrid(
        columns = GridCells.FixedSize(60.dp),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(100){ index ->
            CustomCard(index.toString())
        }
    }
}

@Composable
fun CustomCard(name: String) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                alpha = 1f
            )
        )
    ) {
        Box(
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center,
        ){
            Text(name)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LazyVerticalGridScreenPreview(){
    LazyVerticalGridFixedSizeScreen()
}

@Preview(showBackground = true)
@Composable
fun LazyVerticalGridAdaptiveScreenPreview(){
    LazyVerticalGridAdaptiveScreen()
}