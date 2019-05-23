package com.dmagdaleno.funk.intro

// non-recursive (imperative) way
fun imperativeFactorial(n: Long): Long {
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun main(args: Array<String>) {
    val n = 3L
    println("Imperative: ${imperativeFactorial(n)}")
}