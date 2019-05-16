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

class Transformer {
    fun upperCased(str: String): String {
        return str.toUpperCase()
    }
    companion object {
        fun lowerCased(str: String): String {
            return str.toLowerCase()
        }
    }
}

fun main(args: Array<String>) {

    println(capitalize("test"))

    println(transform("test", capitalize))

    println(transform("test", Obj::reverse))

    println(transform("test", Transformer()::upperCased))

    println(transform("tEsT", Transformer.Companion::lowerCased))

    println(transform("test", { str -> str.substring(0..1) }))

    println(transform("test") { str -> str.substring(0..1) })

    println(transform("test") { it.substring(0..1) })
}
