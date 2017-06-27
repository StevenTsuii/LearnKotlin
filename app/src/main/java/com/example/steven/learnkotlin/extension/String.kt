package com.example.steven.learnkotlin.extension

/**
 * Created by steven on 27/6/2017.
 */

val autherName = "Steven Tsui"

fun String.autherName(): String {
    return this + autherName
}

fun String.appFontFormat(): String {
    return "[" + this.toUpperCase() + "]"
}