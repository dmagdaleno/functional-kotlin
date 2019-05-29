package com.dmagdaleno.funk.intro

import com.dmagdaleno.funk.intro.classes.MyList
import com.dmagdaleno.funk.intro.classes.MyList.Cons
import com.dmagdaleno.funk.intro.classes.MyList.Empty

fun main() {

    testConstruct()

    simpleInit()

    forEach()

}

private fun forEach() {
    val numbers = intListOf(1, 2, 3, 4)
    numbers.forEach {
        println(it)
    }

}

private fun simpleInit() {
    println(intListOf(1, 2, 3, 4))
}

private fun testConstruct() {
    println(Cons(1, Cons(2, Cons(3, Cons(4, Empty)))))
}

fun intListOf(vararg numbers: Int): MyList<Int> {
    return if (numbers.isEmpty()) {
        Empty
    } else {
        Cons(numbers.first(), intListOf(*numbers.drop(1).toTypedArray().toIntArray()))
    }
}