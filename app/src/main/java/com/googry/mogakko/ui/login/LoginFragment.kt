package com.googry.mogakko.ui.login

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.View
import com.googry.mogakko.R
import com.googry.mogakko.databinding.LoginFragmentBinding
import com.googry.mogakko.di.ActivityScoped
import com.googry.zigzagchallenge.base.BaseFragment
import javax.inject.Inject

/**
 * Created by seokjunjeong on 2018. 5. 7..
 */
@ActivityScoped
class LoginFragment @Inject constructor()
    : BaseFragment<LoginFragmentBinding>(R.layout.login_fragment) {

    @Inject
    lateinit var loginViewModelFactory: LoginViewModelFactory

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.run {
            vm = ViewModelProviders.of(this@LoginFragment, loginViewModelFactory)[LoginViewModel::class.java]
        }
    }
}