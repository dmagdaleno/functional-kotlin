package com.dmagdaleno.funk.intro

// lambda function
val capitalize = { str: String -> str.capitalize() }

// higher-order function
fun transform(str:String, func: (String) -> String): String {
    return func(str)
}

object Obj {
    fun reverse(str: String): String {
        return str.reversed()
    }
}

fun main(args: Array<String>) {

    println(capitalize("hello world!"))

    println(transform("test", capitalize))

    println(transform("test", Obj::reverse))
}
