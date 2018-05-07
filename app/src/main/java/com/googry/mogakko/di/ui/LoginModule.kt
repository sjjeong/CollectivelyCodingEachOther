package com.googry.mogakko.di.ui

import com.googry.mogakko.di.FragmentScoped
import com.googry.mogakko.ui.login.LoginFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by seokjunjeong on 2018. 5. 7..
 */

@Module
abstract class LoginModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun loginFragment(): LoginFragment

}