package com.example.steven.learnkotlin.extension

import android.app.Activity
import android.app.Fragment
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import com.example.steven.learnkotlin.R.layout.activity
import com.example.steven.learnkotlin.ui.ThirdActivity
import kotlin.reflect.KClass

/**
 * Created by steven on 27/6/2017.
 */
fun Fragment.inflateView(layoutId: Int, container: ViewGroup?): View {
    return activity.layoutInflater.inflate(layoutId, container, false)
}
