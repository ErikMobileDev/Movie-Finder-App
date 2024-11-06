package com.erikmobiledev.pelifinder.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Movie

@Composable
fun BottomNavigationBar(navController: NavController) {
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry.value?.destination?.route

    NavigationBar {
        NavigationBarItem(
            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
            selected = currentRoute == "Home",
            onClick = {
                navController.navigate("Home") {
                    popUpTo("Home") { saveState = true }
                    launchSingleTop = true
                }
            }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Movie, contentDescription = "Movies") },
            selected = currentRoute == "MovieView",
            onClick = {
                navController.navigate("MovieView") {
                    popUpTo("Home") { saveState = true }
                    launchSingleTop = true
                }
            }
        )
    }
}
