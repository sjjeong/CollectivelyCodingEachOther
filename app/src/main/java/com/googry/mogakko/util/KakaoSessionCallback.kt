package com.googry.mogakko.util

import com.kakao.auth.ISessionCallback
import com.kakao.util.exception.KakaoException
import io.reactivex.subjects.PublishSubject

/**
 * Created by seokjunjeong on 2018. 5. 8..
 */
class KakaoSessionCallback : ISessionCallback {
    val loginEvent = PublishSubject.create<Boolean>()!!

    override fun onSessionOpenFailed(exception: KakaoException?) {
        loginEvent.onNext(false)
    }

    override fun onSessionOpened() {
        loginEvent.onNext(true)
    }
}