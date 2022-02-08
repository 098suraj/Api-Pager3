package com.example.apipaging.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.apipaging.data.local.dao.UnsplashImageDao
import com.example.apipaging.data.local.dao.UnsplashRemoteKeysDao

import com.example.apipaging.model.UnsplashImage
import com.example.apipaging.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}