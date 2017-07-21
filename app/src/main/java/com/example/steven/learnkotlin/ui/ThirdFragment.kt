package com.example.steven.learnkotlin.ui

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.steven.learnkotlin.R
import com.example.steven.learnkotlin.extension.inflateView

/**
 * Created by steven on 18/7/2017.
 */
class ThirdFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflateView(R.layout.fragment_third, container);
    }
}