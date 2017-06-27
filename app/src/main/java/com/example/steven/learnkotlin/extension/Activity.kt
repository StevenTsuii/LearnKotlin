package com.example.steven.learnkotlin.extension

import android.app.Activity
import android.app.Fragment
import android.content.Intent
import android.widget.Toast
import com.example.steven.learnkotlin.SecondActivity
import kotlin.reflect.KClass

/**
 * Created by steven on 27/6/2017.
 */
fun Activity.startActivityTo(kClass: KClass<SecondActivity>) {
    this.startActivity(Intent(this, kClass.java))
}

fun Activity.toast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

fun Activity.addFragmentToContainer(containerId: Int, fragment: Fragment) {
    fragmentManager.beginTransaction().replace(containerId, fragment).commitAllowingStateLoss();
}