package com.naveen.androidjetpacklayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.naveen.androidjetpacklayouts.navigations.DemoRoute
import com.naveen.androidjetpacklayouts.screens.BoxLayoutScreen
import com.naveen.androidjetpacklayouts.screens.BoxLayoutSixScreen
import com.naveen.androidjetpacklayouts.screens.ColumnLayoutScreen
import com.naveen.androidjetpacklayouts.screens.HomeScreen
import com.naveen.androidjetpacklayouts.screens.RowLayoutScreen
import com.naveen.androidjetpacklayouts.screens.viewModel.LayoutViewModel
import com.naveen.androidjetpacklayouts.ui.theme.AndroidJetpackLayoutsTheme

class LayoutDemo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidJetpackLayoutsTheme {
                LayoutDemoApp()
            }
        }
    }
}

@Composable
private fun LayoutDemoApp(viewModel: LayoutViewModel = viewModel()) {
    val navController = rememberNavController()

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = DemoRoute.Home.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(DemoRoute.Home.name) {
                HomeScreen(
                    description = viewModel.description,
                    onOpenColumn = { navController.navigate(DemoRoute.Column.name) },
                    onOpenRow = { navController.navigate(DemoRoute.Row.name) },
                    onOpenBox = { navController.navigate(DemoRoute.Box.name) }
                )
            }
            composable(DemoRoute.Column.name) { ColumnLayoutScreen() }
            composable(DemoRoute.Row.name) { RowLayoutScreen() }
            composable(DemoRoute.Box.name) { BoxLayoutSixScreen() }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomePreview() {
    AndroidJetpackLayoutsTheme { HomeScreen("Preview", {}, {}, {}) }
}

