package com.example.steven.learnkotlin.ui

import android.content.Intent
import com.example.steven.learnkotlin.extension.inflateView
import com.example.steven.learnkotlin.extension.startActivityTo
import kotlinx.android.synthetic.main.fragment_second.*

/**
 * Created by steven on 27/6/2017.
 */
class SecondFragment : android.app.Fragment() {

    val TAG: String = this.javaClass.simpleName
    val title: String by lazy {
        try {
            android.util.Log.d(TAG, "lazy init title ...")
            org.json.JSONObject("asfasdf").getString("TITLE")
            "11111"
        } catch (e: Exception) {
            android.util.Log.d(TAG, "lazy init title fail")
            "asdasf"
            "x"
        }
    }

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: android.view.LayoutInflater?, container: android.view.ViewGroup?, savedInstanceState: android.os.Bundle?): android.view.View {
        return inflateView(com.example.steven.learnkotlin.R.layout.fragment_second, container)
    }

    @android.support.annotation.RequiresApi(android.os.Build.VERSION_CODES.M)
    override fun onViewCreated(view: android.view.View?, savedInstanceState: android.os.Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler_view.layoutManager = android.support.v7.widget.LinearLayoutManager(activity)
        recycler_view.adapter = com.example.steven.learnkotlin.adapter.NormalItemAdapter()
        third_button.setOnClickListener { startActivity(Intent(activity, ThirdActivity::class.java)) }


        var value = "c"
        when (value) {
            "a" -> {
                android.util.Log.d(TAG, "Value is a")
                android.util.Log.d(TAG, "aaaaa")
            }
            "b", "c" -> {
                android.util.Log.d(TAG, "Value is b or c")
                android.util.Log.d(TAG, "value is bbb or cccc")
            }
            "d" -> {
                android.util.Log.d(TAG, "Value is d")
            }
            else -> android.util.Log.d(TAG, "Value is unknown")
        }
        getName(value)
        android.util.Log.d(TAG, "title:" + title)
        android.util.Log.d(TAG, "getPhone:" + getPhone("c"))
    }

    fun getName(value: String) = android.util.Log.d(TAG, "Name is " + value)

    fun getAddress(value: String): String {
        return value + "hahaha"
    }

    fun getPhone(value: String): String {
        return when (value) {
            "c" -> return "123"
            else -> return "444"
        }
    }
}