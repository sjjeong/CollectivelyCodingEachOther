package com.googry.mogakko.di.ui

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import com.googry.mogakko.di.FragmentScoped
import com.googry.mogakko.ui.login.LoginFragment
import com.googry.mogakko.ui.login.LoginViewModel
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

/**
 * Created by seokjunjeong on 2018. 5. 7..
 */

@Module
abstract class LoginModule {

    @FragmentScoped
    @ContributesAndroidInjector(modules = [LoginViewModule::class])
    abstract fun loginFragment(): LoginFragment
}

@Module
class LoginViewModule {
    @Provides
    @FragmentScoped
    fun provideLoginViewModel(loginFragment: LoginFragment) =
            ViewModelProviders.of(loginFragment, object : ViewModelProvider.Factory {
                override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                    @Suppress("UNCHECKED_CAST")
                    return LoginViewModel() as T
                }
            })
                    .get(LoginViewModel::class.java)
}