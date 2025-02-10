package org.example

fun main() {

    val startGooGoo = 2

    for (i in startGooGoo..9) {
        for (j in 2..9) {
            println("i * $j = ${i * j}")
        }
        println()
    }
}