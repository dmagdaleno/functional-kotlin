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

    fun <R> fold(init: R, f: (R, T) -> R): R {
        tailrec fun go(list: MyList<T>, init: R, f: (R, T) -> R): R = when (list) {
            is Cons -> go(list.tail, f(init, list.head), f)
            is Empty -> init
        }
        return go(this, init, f)
    }

    fun reverse(): MyList<T> = fold(Empty as MyList<T>) { accumulator, i -> Cons(i, accumulator) }

    fun <R> foldRight(init: R, f: (R, T) -> R): R {
        return this.reverse().fold(init, f)
    }

    fun <R> map(f:(T) -> R): MyList<R> {
        return foldRight(Empty as MyList<R>){ tail, head -> Cons(f(head), tail) }
    }

}