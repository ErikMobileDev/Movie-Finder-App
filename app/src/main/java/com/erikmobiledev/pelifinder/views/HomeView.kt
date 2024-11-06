package com.erikmobiledev.pelifinder.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.erikmobiledev.pelifinder.model.Movie
import com.erikmobiledev.pelifinder.viewmodels.MovieListViewModel


@Composable
fun HomeView(
    navController: NavController,
    viewModel: MovieListViewModel = hiltViewModel()
) {
    val movies by viewModel.movies.observeAsState(emptyList())

    Scaffold(
        containerColor = MaterialTheme.colorScheme.background
    ) {
        LazyColumn(
            contentPadding = it,
            modifier = Modifier.fillMaxSize()
        ) {
            items(movies) { movie ->
                MovieItem(movie)
            }
        }
    }

    LaunchedEffect(Unit) {
        viewModel.fetchMovies(apiKey = "YOUR_API_KEY_HERE")
    }
}

@Composable
fun MovieItem(movie: Movie) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = movie.title)
        Text(text = movie.overview)
    }
}
