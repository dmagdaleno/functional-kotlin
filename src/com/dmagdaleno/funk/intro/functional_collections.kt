package com.dmagdaleno.funk.intro

val numbers: List<Int> = listOf(1, 2, 3, 4)

fun main(args: Array<String>) {

    // imperative way
    val imperative: MutableList<Int> = mutableListOf()
    for (i in numbers) {
        imperative.add(i * 2)
    }

    // functional way
    val functional = numbers.map { i -> i * 2 }

    println("Imperative: ${imperative.joinToString()}")
    println("Functional: ${functional.joinToString()}")
}