package com.example.expmdmfebrero4.data

import com.example.expmdmfebrero4.domain.Album


class Mockalbum {
    fun invoke(): List<Album> {
        return listOf(
            Album("image_url", "Album 1", "2024-01-01", "Description 1"),
            Album("image_url", "Album 2", "2024-01-01", "Description 2"),
            Album("image_url", "Album 3", "2024-01-01", "Description 3"),
            Album("image_url", "Album 4", "2024-01-01", "Description 4"),
            Album("image_url", "Album 5", "2024-01-01", "Description 5"),
            Album("image_url", "Album 6", "2024-01-01", "Description 6"),
            Album("image_url", "Album 7", "2024-01-01", "Description 7"),
            Album("image_url", "Album 8", "2024-01-01", "Description 8"),
            Album("image_url", "Album 9", "2024-01-01", "Description 9"),
            Album("image_url", "Album 10", "2024-01-01", "Description 10")
        )
    }
}