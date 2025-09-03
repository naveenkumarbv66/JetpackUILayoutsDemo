package com.naveen.androidjetpacklayouts.screens

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.naveen.androidjetpacklayouts.customRow.CustomPersonItem
import com.naveen.androidjetpacklayouts.repository.PersonRepository

@Composable
fun LazyRowScreen() {

    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)
            .padding(10.dp)
            .background(Color.White)
            .padding(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)

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
fun TestTwoLazyRowScreen() {
    val personRepository = PersonRepository()
    val personsData = personRepository.getPersons()

    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(items = personsData) { person ->
            CustomPersonItem(person)
        }
    }
}

@Composable
fun TestThreeLazyRowScreen() {
    val personRepository = PersonRepository()
    val personsData = personRepository.getPersons()

    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        itemsIndexed(items = personsData)
        { index, person ->
            CustomPersonItem(person, index.toString())
        }
    }
}

@Composable
fun TestFourLazyRowScreen() {
    val personRepository = PersonRepository()
    val personsData = personRepository.getPersons()

    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
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
fun TestFiveLazyRowScreen() {
    val personRepository = PersonRepository()

    val personsData = personRepository.getPersons()
    val sections = personRepository.getSections()

    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        sections.forEach { section ->
            stickyHeader {
                Text(
                    modifier = Modifier
                        .background(Color.Blue)
                        .padding(18.dp),
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

@Composable
fun TestSixLazyRowScreen() {
    val personRepository = PersonRepository()

    val personsData = personRepository.getPersons()
    val sections = personRepository.getSections()
    
    // State to track which sections are expanded
    var expandedSections by remember { mutableStateOf(setOf<String>()) }

    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        sections.forEach { section ->
            stickyHeader {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Blue)
                        .clickable {
                            expandedSections = if (expandedSections.contains(section)) {
                                expandedSections - section
                            } else {
                                expandedSections + section
                            }
                        }
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        color = Color.White,
                        text = "Section: $section"
                    )
                    Icon(
                        imageVector = if (expandedSections.contains(section)) {
                            Icons.Default.KeyboardArrowUp
                        } else {
                            Icons.Default.KeyboardArrowDown
                        },
                        contentDescription = if (expandedSections.contains(section)) {
                            "Collapse section"
                        } else {
                            "Expand section"
                        },
                        tint = Color.White
                    )
                }
            }
            
            // Animated content for smooth expand/collapse
            if (expandedSections.contains(section)) {
                item {
                    Row(
                        modifier = Modifier.animateContentSize(
                            animationSpec = tween(durationMillis = 300)
                        )
                    ) {
                        personsData.forEach { person ->
                            CustomPersonItem(person)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LazyRowScreenPreview(){
    TestSixLazyRowScreen()
}