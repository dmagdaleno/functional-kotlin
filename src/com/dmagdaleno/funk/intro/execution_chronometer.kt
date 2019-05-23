package com.dmagdaleno.funk.intro

fun executionTime(body: () -> Unit): Long {
    val startTime = System.nanoTime()
    body()
    val endTime = System.nanoTime()
    return endTime - startTime
}