package com.googry.mogakko.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.googry.mogakko.R
import com.googry.mogakko.ui.login.LoginActivity
import org.jetbrains.anko.startActivity

/**
 * Created by seokjunjeong on 2018. 4. 24..
 */
class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.launcher_activity)
        startActivity<LoginActivity>()
        finish()
    }
}
