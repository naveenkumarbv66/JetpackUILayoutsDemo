package com.naveen.androidjetpacklayouts.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.naveen.androidjetpacklayouts.customRow.CustomPersonItem
import com.naveen.androidjetpacklayouts.repository.PersonRepository

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

@Composable
fun TestTwoLazyColumnScreen() {
    val personRepository = PersonRepository()
    val personsData = personRepository.getPersons()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(items = personsData) { person ->
            CustomPersonItem(person)
        }
    }
}

@Composable
fun TestThreeLazyColumnScreen() {
    val personRepository = PersonRepository()
    val personsData = personRepository.getPersons()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        itemsIndexed(items = personsData)
        { index, person ->
            CustomPersonItem(person, index.toString())
        }
    }
}

@Composable
fun TestFourLazyColumnScreen() {
    val personRepository = PersonRepository()
    val personsData = personRepository.getPersons()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        itemsIndexed(
            items = personsData,
            key = { index, person -> person.id }
        ){ index, person ->
            CustomPersonItem(person, index.toString())
        }
    }
}

@Composable
fun TestFiveLazyColumnScreen() {
    val personRepository = PersonRepository()

    val personsData = personRepository.getPersons()
    val sections = personRepository.getSections()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        sections.forEach { section ->
            stickyHeader {
                Text(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Blue)
                        .padding(8.dp),
                    color = Color.White,
                    text = "Section: $section"
                )
            }
            items(items = personsData) { person ->
                CustomPersonItem(person)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LazyColumnScreenPreview(){
    TestFiveLazyColumnScreen()
}