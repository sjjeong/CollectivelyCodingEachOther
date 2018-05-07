package com.googry.mogakko.ui.login

import android.support.v4.app.Fragment
import com.googry.mogakko.di.ActivityScoped
import com.googry.zigzagchallenge.base.BaseFragmentBindingActivity
import javax.inject.Inject

/**
 * Created by seokjunjeong on 2018. 5. 7..
 */
class LoginActivity : BaseFragmentBindingActivity() {
    @Inject
    lateinit var loginFragment: LoginFragment

    override fun getFragment(): Fragment = loginFragment
}