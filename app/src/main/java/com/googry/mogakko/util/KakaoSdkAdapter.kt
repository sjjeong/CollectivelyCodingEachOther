package com.googry.mogakko.util

import android.app.Application
import com.kakao.auth.IApplicationConfig
import com.kakao.auth.KakaoAdapter

/**
 * Created by seokjunjeong on 2018. 5. 8..
 */
class KakaoSdkAdapter(val application: Application) : KakaoAdapter() {

    override fun getApplicationConfig(): IApplicationConfig = IApplicationConfig {
        application
    }
}