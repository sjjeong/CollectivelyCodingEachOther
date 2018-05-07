package com.googry.zigzagchallenge.base

import android.os.Bundle
import android.support.v4.app.Fragment
import com.googry.mogakko.R
import com.googry.mogakko.ext.addFragment
import dagger.android.support.DaggerAppCompatActivity

abstract class BaseFragmentBindingActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.base_fragment_binding_activity)
        addFragment(getFragment())
    }

    abstract fun getFragment(): Fragment
}