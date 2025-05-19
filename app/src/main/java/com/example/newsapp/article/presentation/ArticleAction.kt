package com.example.newsapp.article.presentation

sealed interface ArticleAction {
    data class LoadArticle(val articleId: String): ArticleAction
}