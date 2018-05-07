package com.googry.mogakko.ui.login

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import javax.inject.Inject

/**
 * Created by seokjunjeong on 2018. 5. 7..
 */
class LoginViewModelFactory @Inject constructor() : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T = LoginViewModel() as T

}