package com.dmagdaleno.funk.intro

fun main(args: Array<String>) {

    val i by lazy {
        println("Lazy evaluation")
        10
    }

    println("before using i")

    println(i)
}