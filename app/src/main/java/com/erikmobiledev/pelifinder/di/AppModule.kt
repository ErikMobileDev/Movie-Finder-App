package com.erikmobiledev.pelifinder.di

import android.content.Context
import androidx.room.Room
import com.erikmobiledev.pelifinder.room.MoviesDatabase
import com.erikmobiledev.pelifinder.room.MoviesDatabaseDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideMovieDatabaseDao(moviesDatabase: MoviesDatabase) : MoviesDatabaseDao {
        return moviesDatabase.moviesDao()
    }

    @Singleton
    @Provides
    fun providesMovieDatabase(@ApplicationContext context: Context) : MoviesDatabase {
        return Room.databaseBuilder(
            context,
            MoviesDatabase::class.java,
            "movies_db"
        ).fallbackToDestructiveMigration()
            .build()
    }
}