package com.erikmobiledev.pelifinder.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.erikmobiledev.pelifinder.model.Movie

@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class MoviesDatabase : RoomDatabase() {

    abstract fun moviesDao(): MoviesDatabaseDao

}