package com.naveen.androidjetpacklayouts.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
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
fun CustomHorizontalGridCard(name: String) {
    Card(
        modifier = Modifier.height(100.dp).width(100.dp),
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
            modifier = Modifier.height(100.dp).width(100.dp),
            contentAlignment = Alignment.Center,
        ){
            Text(name)
        }
    }
}

@Composable
fun LazyHorizontalGridScreen(){
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
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
fun LazyHorizontalGridAdaptiveScreen(){
    LazyHorizontalGrid(
        rows = GridCells.Adaptive(60.dp),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(100){ index ->
            CustomHorizontalGridCard(index.toString())
        }
    }
}

@Composable
fun LazyHorizontalGridFixedSizeScreen(){
    LazyHorizontalGrid(
        rows = GridCells.FixedSize(60.dp),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(100){ index ->
            CustomCard(index.toString())
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LazyHorizontalGridScreenPreview(){
    LazyHorizontalGridScreen()
}

@Preview(showBackground = true)
@Composable
fun LazyHorizontalGridFixedSizeScreenPreview(){
    LazyHorizontalGridFixedSizeScreen()
}

@Preview(showBackground = true)
@Composable
fun LazyHorizontalGridAdaptiveScreenPreview(){
    LazyHorizontalGridAdaptiveScreen()
}