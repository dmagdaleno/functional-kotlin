package com.dmagdaleno.funk.intro

import com.dmagdaleno.funk.intro.classes.MyList.Cons
import com.dmagdaleno.funk.intro.classes.MyList.Empty

fun main(args: Array<String>) {
    val numbers = Cons(1, Cons(2, Cons(3, Cons(4, Empty))))
    println(numbers)
}