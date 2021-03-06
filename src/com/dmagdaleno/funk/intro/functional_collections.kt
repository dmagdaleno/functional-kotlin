package com.dmagdaleno.funk.intro

val numbers: List<Int> = listOf(1, 2, 3, 4)

fun main(args: Array<String>) {

    mapAListToAnother()

    sumItemsOfAList()

    sumItemsOfAListWithFold()

    sumItemsOfAListWithReduce()
}

private fun mapAListToAnother() {
    println()

    // imperative way
    val imperative: MutableList<Int> = mutableListOf()
    for (i in numbers) {
        imperative.add(i * 2)
    }
    println("Imperative: ${imperative.joinToString()}")

    // functional way
    val functional = numbers.map { i -> i * 2 }
    println("Functional: ${functional.joinToString()}")
}

private fun sumItemsOfAList() {
    println()

    // imperative way
    var sum = 0
    for (i in numbers) {
        sum += i
    }
    println("Imperative: $sum")

    // functional way
    println("Functional: ${numbers.sum()}")
}

private fun sumItemsOfAListWithFold() {
    val sum = numbers.fold(0) { acc, i ->
        println("acc, i = $acc, $i")
        acc + i
    }
    println("Functional (with fold): $sum")
}

private fun sumItemsOfAListWithReduce() {
    val sum = numbers.reduce { acc, i ->
        println("acc, i = $acc, $i")
        acc + i
    }
    println("Functional (with reduce): $sum")
}