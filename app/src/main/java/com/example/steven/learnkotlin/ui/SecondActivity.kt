package com.example.steven.learnkotlin.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.steven.learnkotlin.R
import com.example.steven.learnkotlin.extension.addFragmentToContainer

/**
 * Created by steven on 27/6/2017.
 */
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)
        addFragmentToContainer(R.id.container, SecondFragment())
    }
}