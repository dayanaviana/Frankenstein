package com.b29.frankenstein.di

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Provides
    fun providesFirebaseAuth():FirebaseAuth = FirebaseAuth.getInstance()

    @Provides
    fun providesFirebaseDb():FirebaseDatabase = FirebaseDatabase.getInstance()

}