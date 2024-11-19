package com.erikmobiledev.pelifinder.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.erikmobiledev.pelifinder.components.BottomNavigationBar
import com.erikmobiledev.pelifinder.viewModels.MovieListViewModel
import com.erikmobiledev.pelifinder.views.HomeView
import com.erikmobiledev.pelifinder.views.MovieView

@Composable
fun NavManager(movieListViewModel: MovieListViewModel) {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "Home",
            Modifier.padding(innerPadding)
        ) {
            composable("Home") {
                HomeView(navController)
            }
            composable("MovieView") {
                MovieView(navController)
            }
        }
    }
}