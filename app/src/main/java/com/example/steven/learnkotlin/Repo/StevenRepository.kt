package com.example.steven.learnkotlin.Repo

import android.content.Context
import android.util.Log
import io.reactivex.Flowable
import io.reactivex.Single

/**
 * Created by steven on 7/7/2017.
 */
object StevenRepository {

    val TAG = "${this@StevenRepository.javaClass.simpleName}"

    init {
        Log.d(TAG, "initialized... ${TAG}")
    }

    fun getFilteredData(): Flowable<String> {
        return Flowable.fromIterable(getTestData()).filter { !it.contentEquals("b") }
    }

    fun getMapData(): Flowable<Int> {
        return Flowable.fromIterable(getTestData()).map { it.length }
    }

    fun getFlatMapData(): Flowable<List<String>> {
        return Flowable.fromIterable(getTestData()).flatMap { Flowable.fromArray(listOf(it, it, it, it)).map { it + " & " + it } }.filter { it.size>5 }
    }
    fun getTestData(): List<String> = listOf("aaa", "b", "cccc", "ddddddddddd")
}