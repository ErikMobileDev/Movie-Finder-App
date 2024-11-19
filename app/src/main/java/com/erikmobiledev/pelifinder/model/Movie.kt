package com.erikmobiledev.pelifinder.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class Movie(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    @ColumnInfo("title")
    val title: String,
    @ColumnInfo("overview")
    val overview: String,
    @ColumnInfo("poster_path")
    val poster_path: String
)
