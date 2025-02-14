package com.example.expmdmfebrero4.data

import com.example.expmdmfebrero4.data.Setas

class MockSetas {
    fun invoke(): List<Setas> {
        return listOf(
            Setas("Amanita muscaria", "image_url"),
            Setas("Boletus edulis", "image_url"),
            Setas("Cantharellus cibarius", "image_url"),
            Setas("Agaricus bisporus", "image_url"),
            Setas("Pleurotus ostreatus", "image_url"),
            Setas("Lentinula edodes", "image_url"),
            Setas("Morchella esculenta", "image_url"),
            Setas("Trametes versicolor", "image_url"),
            Setas("Coprinus comatus", "image_url"),
            Setas("Hydnum repandum", "image_url")
        )
    }
}