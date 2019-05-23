package com.dmagdaleno.funk.intro

// non-recursive (imperative) way
fun factorial(n: Long): Long {
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun main(args: Array<String>) {
    println(factorial(n))
}