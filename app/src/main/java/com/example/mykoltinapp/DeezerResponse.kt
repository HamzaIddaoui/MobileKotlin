package com.example.mykoltinapp

// DeezerResponse.kt
data class DeezerResponse(val data: List<Track>)

// Track.kt
data class Track(
    val title: String,
    val artist: Artist,
    val album: Album,
    val duration: Int
)

// Album.kt
data class Album(
    val title: String,
    val cover_medium: String,
    val cover_big: String
)

// Artist.kt
data class Artist(
    val name: String,
    val picture_big: String
)
