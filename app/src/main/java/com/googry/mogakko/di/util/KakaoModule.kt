package com.googry.mogakko.di.util

import android.app.Application
import com.googry.mogakko.util.KakaoSdkAdapter
import com.googry.mogakko.util.KakaoSessionCallback
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by seokjunjeong on 2018. 5. 8..
 */
@Module
class KakaoModule {
    @Provides
    @Singleton
    fun provideKakaoSdkAdapter(application: Application) = KakaoSdkAdapter(application)

    @Provides
    @Singleton
    fun provideKakaoSessionCallback() = KakaoSessionCallback(

    )
}