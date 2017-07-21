package com.example.steven.learnkotlin.ui

import com.example.steven.learnkotlin.extension.appFontFormat
import com.example.steven.learnkotlin.extension.autherName
import com.example.steven.learnkotlin.extension.startActivityTo
import com.example.steven.learnkotlin.extension.toast
import com.example.steven.learnkotlin.databinding.ActivityMainBinding;
import com.example.steven.learnkotlin.viewholder.MainActivityViewHolder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : android.support.v7.app.AppCompatActivity() {

    val TAG: String by lazy { this.javaClass.simpleName }
    lateinit var mutableValue: User
    val immutableValue: User by lazy { setUp2() }
    var nullableValue: String? = "bbb"
    lateinit var binding: ActivityMainBinding
    lateinit var viewHolder: MainActivityViewHolder
    var mad: String = "${nullableValue?.appFontFormat()}  <---Crazy"


    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = android.databinding.DataBindingUtil.setContentView(this, com.example.steven.learnkotlin.R.layout.activity_main)
        viewHolder = com.example.steven.learnkotlin.viewholder.MainActivityViewHolder()
        viewHolder.myMessage.set("changed myMessage")
        binding.viewHolder = viewHolder


        mutableValue = User()
        text_view.text = "Here is " + TAG.appFontFormat() + " by ".autherName()
        nullableValue = null
        android.util.Log.d(TAG, "nullableValue: " + nullableValue)

        text_view.setOnClickListener { startActivityTo(SecondActivity::class) }
        toast(mad)
    }

    fun setUp() {
        mutableValue = com.example.steven.learnkotlin.ui.MainActivity.User()
    }

    fun setUp2(): com.example.steven.learnkotlin.ui.MainActivity.User {
        android.util.Log.d(TAG, "immutableValue setUp2")
        return com.example.steven.learnkotlin.ui.MainActivity.User()
    }

    class User {
        val type: String = "User"
    }
}
