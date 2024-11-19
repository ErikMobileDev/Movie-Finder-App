package com.erikmobiledev.pelifinder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.erikmobiledev.pelifinder.navigation.NavManager
import com.erikmobiledev.pelifinder.ui.theme.PeliFinderTheme
import com.erikmobiledev.pelifinder.viewModels.MovieListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val movieListViewModel: MovieListViewModel by viewModels()
        super.onCreate(savedInstanceState)
        setContent {
            PeliFinderTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    NavManager(movieListViewModel)
                }
            }
        }
    }
}