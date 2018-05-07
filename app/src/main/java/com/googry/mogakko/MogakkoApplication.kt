package com.googry.mogakko

import com.googry.mogakko.di.DaggerAppComponent
import com.googry.mogakko.util.KakaoSdkAdapter
import com.kakao.auth.KakaoSDK
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Inject

/**
 * Created by seokjunjeong on 2018. 4. 24..
 */
class MogakkoApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }

    @Inject
    lateinit var kakaoSdkAdapter: KakaoSdkAdapter

    override fun onCreate() {
        super.onCreate()
        KakaoSDK.init(kakaoSdkAdapter)
    }
}