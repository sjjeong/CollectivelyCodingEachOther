package com.googry.mogakko.ui.login

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.googry.mogakko.R
import com.googry.mogakko.databinding.LoginFragmentBinding
import com.googry.mogakko.di.ActivityScoped
import com.googry.mogakko.ui.SampleActivity
import com.googry.mogakko.util.KakaoSessionCallback
import com.googry.zigzagchallenge.base.BaseFragment
import com.kakao.auth.Session
import org.jetbrains.anko.startActivity
import javax.inject.Inject

/**
 * Created by seokjunjeong on 2018. 5. 7..
 */
@ActivityScoped
class LoginFragment @Inject constructor()
    : BaseFragment<LoginFragmentBinding>(R.layout.login_fragment) {

    @Inject
    lateinit var loginViewModelFactory: LoginViewModelFactory

    @Inject
    lateinit var kakaoSessionCallback: KakaoSessionCallback

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.run {
            vm = ViewModelProviders.of(this@LoginFragment, loginViewModelFactory)[LoginViewModel::class.java]
        }
        compositeDisposable.add(kakaoSessionCallback.loginEvent
                .subscribe({ activity?.startActivity<SampleActivity>() }) {
                    Toast.makeText(context, "error", Toast.LENGTH_SHORT).show()
                })
        Session.getCurrentSession().run {
            addCallback(kakaoSessionCallback)
            checkAndImplicitOpen()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (Session.getCurrentSession().handleActivityResult(requestCode, resultCode, data)) {
            return
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

    override fun onDestroyView() {
        Session.getCurrentSession().removeCallback(kakaoSessionCallback)
        super.onDestroyView()
    }
}