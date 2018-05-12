package com.googry.mogakko.ui.login

import android.content.Intent
import android.support.v4.app.Fragment
import com.googry.zigzagchallenge.base.BaseFragmentBindingActivity

/**
 * Created by seokjunjeong on 2018. 5. 7..
 */
class LoginActivity : BaseFragmentBindingActivity() {
    override fun createFragment(): Fragment = LoginFragment.newInstance()

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        fragment.onActivityResult(requestCode, resultCode, data)
    }
}