package com.example.steven.learnkotlin.adapter


import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.steven.learnkotlin.R

/**
 * Created by steven on 27/6/2017.
 */
class NormalItemAdapter : RecyclerView.Adapter<NormalItemAdapter.NormalItemViewHolder>() {

    var itemList = listOf<String>("a", "b", "c", "b", "c", "b", "c", "b", "c", "b", "c", "b", "c", "b", "c", "b", "c", "b", "c", "b", "c", "b", "c", "b", "c", "b", "c")

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): NormalItemViewHolder {
        return NormalItemViewHolder(LayoutInflater.from(parent!!.context).inflate(R.layout.view_normal_item, parent, false))
    }

    override fun onBindViewHolder(holder: NormalItemViewHolder?, position: Int) {
       Log.d("", "")
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


    class NormalItemViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    }

}