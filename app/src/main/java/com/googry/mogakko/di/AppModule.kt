package com.googry.mogakko.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by seokjunjeong on 2018. 4. 24..
 */
@Module
abstract class AppModule {

    @Provides
    @Singleton
    @Named("appContext")
    fun provideContext(application: Application): Context = application.applicationContext
}