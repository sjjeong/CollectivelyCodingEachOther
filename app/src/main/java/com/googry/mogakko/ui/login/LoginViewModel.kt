package com.googry.mogakko.ui.login

import com.googry.mogakko.util.LogE
import com.googry.zigzagchallenge.base.BaseViewModel

/**
 * Created by seokjunjeong on 2018. 5. 7..
 */
class LoginViewModel : BaseViewModel() {
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