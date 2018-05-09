package com.googry.mogakko.ui.login

import android.databinding.ObservableField
import com.googry.mogakko.util.LogE
import com.googry.zigzagchallenge.base.BaseViewModel
import javax.inject.Inject

/**
 * Created by seokjunjeong on 2018. 5. 7..
 */
class LoginViewModel @Inject constructor() : BaseViewModel() {
    val testMessage = ObservableField<String>("test Message")


    // DataBinding Method
    fun login(site: String) {
        when (site) {
            "facebook" -> {
                LogE("facebook login")
            }
            else -> {
                error("Unimplemented site login.")
            }
        }
    }
}