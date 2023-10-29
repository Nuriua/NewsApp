package com.selva.newsapp.ui

import androidx.lifecycle.ViewModel
import com.selva.newsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}