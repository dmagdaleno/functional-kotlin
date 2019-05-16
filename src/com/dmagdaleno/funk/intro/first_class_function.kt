package com.dmagdaleno.funk.intro

// lambda function
val capitalize = { str: String -> str.capitalize() }

// higher-order function
fun transform(str:String, func: (String) -> String): String {
    return func(str)
}

fun main(args: Array<String>) {

    println(capitalize("hello world!"))

    println(transform("test", capitalize))
}
