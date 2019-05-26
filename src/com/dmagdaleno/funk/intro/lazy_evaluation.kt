package com.dmagdaleno.funk.intro

fun main(args: Array<String>) {

    val i by lazy {
        println("Lazy evaluation")
        10
    }

    println("before using i")

    println(i)

    // throw exception 'ArithmeticException: / by zero'
    //val size = listOf(2 + 1, 3 * 2, 1 / 0, 5 - 4).size

    // this version does not throw exception until the value is used
    val size = listOf({ 2 + 1 }, { 3 * 2 }, { 1 / 0 }, { 5 - 4 }).size
    println(size)
}