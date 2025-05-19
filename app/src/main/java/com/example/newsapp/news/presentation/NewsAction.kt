package com.example.newsapp.news.presentation

sealed interface NewsAction {
    data object Paginate: NewsAction
}