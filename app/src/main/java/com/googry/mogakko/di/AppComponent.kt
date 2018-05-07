package com.googry.mogakko.di

import android.app.Application
import com.googry.mogakko.MogakkoApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
//    AppModule::class,
    ActivityBinder::class])
interface AppComponent : AndroidInjector<MogakkoApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: Application): Builder

        fun build(): AppComponent
    }
}
