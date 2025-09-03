package com.naveen.androidjetpacklayouts.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
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
fun LazyStaggeredGridScreen(){
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Adaptive(100.dp),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalItemSpacing = 8.dp,
    ) {
        items(100){ index ->
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
                        .height(Random.nextInt(100, 300).dp)
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center,
                ){
                    Text(index.toString())
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LazyStaggeredGridScreenPreview(){
    LazyStaggeredGridScreen()
}