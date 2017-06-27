package com.example.steven.learnkotlin.viewholder

import android.databinding.BaseObservable
import android.databinding.ObservableField

/**
 * Created by steven on 27/6/2017.
 */
class MainActivityViewHolder : BaseObservable() {
    val testItem: ObservableField<String> = ObservableField()
    val myMessage: ObservableField<String> by lazy { ObservableField<String>() }

}
