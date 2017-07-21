package com.example.steven.learnkotlin

import android.app.Application
import android.util.Log
import com.example.steven.learnkotlin.Repo.StevenRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by steven on 7/7/2017.
 */
class App : Application() {

    val TAG: String = "${this.javaClass.simpleName}"
    val xxx : String by lazy { "x_x" }
    companion object {
        lateinit var instance: App
        private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        Log.d(TAG, "App getFilteredData()...")
        StevenRepository.getFilteredData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { Log.d(TAG, "getFilteredData(): ${it}") }


        StevenRepository.getMapData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { Log.d(TAG, "getMapData(): ${it}") }


        StevenRepository.getFlatMapData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { Log.d(TAG, "getFlatMapData(): ${it}") }
    }
}