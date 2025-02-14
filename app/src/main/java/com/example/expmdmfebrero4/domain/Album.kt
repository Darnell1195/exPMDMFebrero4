package com.example.expmdmfebrero4.domain


data class Album(
    val imageUrl: String,
    val name: String,
    val date: String,
    val description: String,
    var isFavorite: Boolean = false
)