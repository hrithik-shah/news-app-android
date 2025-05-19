package com.example.newsapp.news.di

import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.newsapp.news.presentation.NewsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val newsModule = module {
    viewModel { NewsViewModel(get()) }
}