package com.example.steven.learnkotlin.ui

import android.app.Activity
import android.os.Bundle
import com.example.steven.learnkotlin.R
import com.example.steven.learnkotlin.extension.addFragmentToContainer

/**
 * Created by steven on 18/7/2017.
 */
class ThirdActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)
        addFragmentToContainer(R.id.container, ThirdFragment())
    }
}
