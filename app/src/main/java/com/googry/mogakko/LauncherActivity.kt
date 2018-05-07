package com.googry.mogakko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.googry.mogakko.ui.login.LoginActivity
import org.jetbrains.anko.startActivity

class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.launcher_activity)
        startActivity<LoginActivity>()
    }
}
