package org.example

fun main() {

    for (i in 2..9) {
        for (j in 2..9) {
            println("i * $j = ${i * j}")
        }
        println()
    }
}