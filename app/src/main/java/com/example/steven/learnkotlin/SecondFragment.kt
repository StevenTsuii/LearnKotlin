package com.example.steven.learnkotlin

import android.app.Fragment
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import com.example.steven.learnkotlin.adapter.NormalItemAdapter
import com.example.steven.learnkotlin.extension.inflateView
import kotlinx.android.synthetic.main.fragment_second.*
import org.json.JSONObject

/**
 * Created by steven on 27/6/2017.
 */
class SecondFragment : Fragment() {

    val TAG: String = this.javaClass.simpleName
    val title: String by lazy {
        try {
            Log.d(TAG, "lazy init title ...")
            JSONObject("asfasdf").getString("TITLE")
            "11111"
        } catch (e: Exception) {
            Log.d(TAG, "lazy init title fail")
            "asdasf"
            "x"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflateView(R.layout.fragment_second, container)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button2.text = "press me"
        recycler_view.layoutManager = LinearLayoutManager(activity)
        recycler_view.adapter = NormalItemAdapter()


        var value = "c"
        when (value) {
            "a" -> {
                Log.d(TAG, "Value is a")
                Log.d(TAG, "aaaaa")
            }
            "b", "c" -> {
                Log.d(TAG, "Value is b or c")
                Log.d(TAG, "value is bbb or cccc")
            }
            "d" -> {
                Log.d(TAG, "Value is d")
            }
            else -> Log.d(TAG, "Value is unknown")
        }
        getName(value)
        Log.d(TAG, "title:" + title)
        Log.d(TAG, "getPhone:" + getPhone("c"))
    }

    fun getName(value: String) = Log.d(TAG, "Name is " + value)

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