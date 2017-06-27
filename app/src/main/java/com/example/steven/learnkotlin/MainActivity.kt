package com.example.steven.learnkotlin

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.steven.learnkotlin.databinding.ActivityMainBinding
import com.example.steven.learnkotlin.extension.appFontFormat
import com.example.steven.learnkotlin.extension.autherName
import com.example.steven.learnkotlin.extension.startActivityTo
import com.example.steven.learnkotlin.extension.toast
import com.example.steven.learnkotlin.viewholder.MainActivityViewHolder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG: String by lazy { this.javaClass.simpleName }
    lateinit var mutableValue: User
    val immutableValue: User by lazy { setUp2() }
    var nullableValue: String? = "bbb"
    lateinit var binding: ActivityMainBinding
    lateinit var viewHolder: MainActivityViewHolder


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewHolder = MainActivityViewHolder()
        viewHolder.myMessage.set("changed myMessage")
        binding.viewHolder = viewHolder


        mutableValue = User()
        text_view.text = "Here is " + TAG.appFontFormat() + " by ".autherName()
        nullableValue = null
        Log.d(TAG, "nullableValue: " + nullableValue)

        text_view.setOnClickListener { startActivityTo(SecondActivity::class) }
        toast("Welcome to " + TAG)
    }

    fun setUp() {
        mutableValue = User()
    }

    fun setUp2(): User {
        Log.d(TAG, "immutableValue setUp2")
        return User()
    }

    class User {
        val type: String = "User"
    }
}
