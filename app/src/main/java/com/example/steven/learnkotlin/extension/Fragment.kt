package com.example.steven.learnkotlin.extension

import android.app.Fragment
import android.view.View
import android.view.ViewGroup

/**
 * Created by steven on 27/6/2017.
 */
fun Fragment.inflateView(layoutId: Int, container: ViewGroup?): View {
    return activity.layoutInflater.inflate(layoutId, container, false)
}