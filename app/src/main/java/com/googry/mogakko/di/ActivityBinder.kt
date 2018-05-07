package com.googry.mogakko.di

import com.googry.mogakko.di.ui.LoginModule
import com.googry.mogakko.ui.login.LoginActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by seokjunjeong on 2018. 4. 24..
 */
@Module
abstract class ActivityBinder {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [LoginModule::class])
    abstract fun loginActivity(): LoginActivity

}