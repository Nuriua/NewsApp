package com.selva.newsapp.models


import com.google.gson.annotations.SerializedName
import com.selva.newsapp.models.Article

data class NewsResponse(
    @SerializedName("articles")
    val articles: List<Article>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)