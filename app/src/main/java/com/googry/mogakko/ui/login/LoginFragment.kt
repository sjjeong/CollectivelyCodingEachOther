package com.googry.mogakko.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.googry.mogakko.R
import com.googry.mogakko.databinding.LoginFragmentBinding
import com.googry.mogakko.ui.SampleActivity
import com.googry.mogakko.util.KakaoSessionCallback
import com.googry.zigzagchallenge.base.BaseFragment
import com.kakao.auth.Session
import io.reactivex.android.schedulers.AndroidSchedulers
import org.jetbrains.anko.startActivity
import javax.inject.Inject

/**
 * Created by seokjunjeong on 2018. 5. 7..
 */
class LoginFragment : BaseFragment<LoginFragmentBinding>(R.layout.login_fragment) {

    companion object {
        fun newInstance() = LoginFragment().apply {

        }
    }

    @Inject
    lateinit var loginViewModel: LoginViewModel

    @Inject
    lateinit var kakaoSessionCallback: KakaoSessionCallback

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.run {
            vm = loginViewModel
        }
        compositeDisposable.add(kakaoSessionCallback.loginEvent
                .filter { it }
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    activity?.run {
                        startActivity<SampleActivity>()
                        activity?.finish()
                    }
                })
        compositeDisposable.add(kakaoSessionCallback.errorEvent
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    it.printStackTrace()
                    Toast.makeText(context, R.string.login_fail, Toast.LENGTH_SHORT).show()
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