package com.naveen.androidjetpacklayouts.screens.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LayoutViewModel : ViewModel() {
    var description by mutableStateOf(
        "Explore Jetpack Compose layout primitives with MVVM: Column, Row, and Box.\n" +
                "Tap a button to navigate and see each layout arrange its children."
    )
        private set
}