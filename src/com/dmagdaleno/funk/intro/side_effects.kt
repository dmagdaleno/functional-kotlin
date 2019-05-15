package com.dmagdaleno.funk.intro

fun main(args: Array<String>) {
    var i = 0

    // function with side effects
    fun g(x: Long): Long {
        return x * i
    }

    println(g(1))
    i++
    println(g(1))
    i++
    println(g(1))
}