package com.example.apipaging.model

import com.example.apipaging.model.UnsplashImage
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchResult(
    @SerialName("results")
    val images: List<UnsplashImage>,
)