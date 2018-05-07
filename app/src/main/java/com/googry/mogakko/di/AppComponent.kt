package com.googry.mogakko.di

import android.app.Application
import com.googry.mogakko.MogakkoApplication
import com.googry.mogakko.di.util.KakaoModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by seokjunjeong on 2018. 4. 24..
 */
@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityBinder::class,
    KakaoModule::class])
interface AppComponent : AndroidInjector<MogakkoApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: Application): Builder

        fun build(): AppComponent
    }
}
