package com.example.newsapp.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ag_apps.newsapp.core.data.local.ArticlesDao

@Database(
    entities = [ArticleEntity::class],
    version = 1
)
abstract class ArticleDatabase: RoomDatabase() {
    abstract val dao: ArticlesDao
}