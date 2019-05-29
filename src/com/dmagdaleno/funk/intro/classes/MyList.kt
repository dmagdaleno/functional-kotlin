package com.dmagdaleno.funk.intro.classes

sealed class MyList<out T> {

    object Empty : MyList<Nothing>()

    data class Cons<out T>(val head: T, val tail: MyList<T>) : MyList<T>()

}