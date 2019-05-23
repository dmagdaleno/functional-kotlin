package com.dmagdaleno.funk.intro

// non-recursive (imperative) way
fun imperativeFactorial(n: Long): Long {
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}

// recursive (no loops or state change)
fun functionalFactorial(n: Long): Long {
    fun go(n: Long, acc: Long): Long {
        return if (n <= 0) {
            acc
        } else {
            go(n - 1, n * acc)
        }
    }
    return go(n, 1)
}

// recursive with tailrec modifier
fun tailrecFactorial(n: Long): Long {
    tailrec fun go(n: Long, acc: Long): Long {
        return if (n <= 0) {
            acc
        } else {
            go(n - 1, n * acc)
        }
    }
    return go(n, 1)
}

fun main(args: Array<String>) {
    val n = 4L
    println("Imperative: ${imperativeFactorial(n)}")
    println("Functional: ${functionalFactorial(n)}")
    println("Tailrec: ${tailrecFactorial(n)}")
}