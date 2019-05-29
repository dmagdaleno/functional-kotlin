package com.dmagdaleno.funk.intro

import com.dmagdaleno.funk.intro.classes.MyList
import com.dmagdaleno.funk.intro.classes.MyList.Cons
import com.dmagdaleno.funk.intro.classes.MyList.Empty

fun main() {
    
    println(Cons(1, Cons(2, Cons(3, Cons(4, Empty)))))

    println(intListOf(1, 2, 3, 4))
}

fun intListOf(vararg numbers: Int): MyList<Int> {
    return if (numbers.isEmpty()) {
        Empty
    } else {
        Cons(numbers.first(), intListOf(*numbers.drop(1).toTypedArray().toIntArray()))
    }
}