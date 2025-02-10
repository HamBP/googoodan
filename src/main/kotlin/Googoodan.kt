package org.example

class Googoodan {
    fun printGoogoodan(begin: Int = 2, end: Int = 10) {
        for (i in begin until end) {
            for (j in 2 until end) {
                println("i * $j = ${i * j}")
            }
            println()
        }
    }
}