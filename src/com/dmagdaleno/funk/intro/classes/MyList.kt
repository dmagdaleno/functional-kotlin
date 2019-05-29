package com.dmagdaleno.funk.intro.classes

sealed class MyList<out T> {

    object Empty : MyList<Nothing>()

    data class Cons<out T>(val head: T, val tail: MyList<T>) : MyList<T>()

    fun forEach(f: (T) -> Unit) {
        tailrec fun go(list: MyList<T>, f: (T) -> Unit) {
            when (list) {
                is Cons -> {
                    f(list.head)
                    go(list.tail, f)
                }
                is Empty -> Unit
            }
        }
        go(this, f)
    }

}