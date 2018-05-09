package com.googry.mogakko.di.ui

import android.arch.lifecycle.ViewModelProviders
import com.googry.mogakko.di.ActivityScoped
import com.googry.mogakko.di.FragmentScoped
import com.googry.mogakko.ui.login.LoginFragment
import com.googry.mogakko.ui.login.LoginViewModel
import com.googry.mogakko.ui.login.LoginViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

/**
 * Created by seokjunjeong on 2018. 5. 7..
 */

@Module
abstract class LoginModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun loginFragment(): LoginFragment

    @Module
    companion object {
        @Provides
        @ActivityScoped
        fun provideLoginViewModel(loginFragment: LoginFragment,
                                  loginViewModelFactory: LoginViewModelFactory) =
                ViewModelProviders.of(loginFragment, loginViewModelFactory)
                        .get(LoginViewModel::class.java)
    }

}