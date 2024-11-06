package com.erikmobiledev.pelifinder.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun MovieView(navController: NavController) {
    Scaffold(
        containerColor = MaterialTheme.colorScheme.background, floatingActionButton = {
    }) {
        ContentMovieView(it, navController)
    }
}

@Composable
fun ContentMovieView(it: PaddingValues, navController: NavController) {
    Column(
        modifier = Modifier
            .padding(it)
            .fillMaxSize()
    ) {

    }
}
