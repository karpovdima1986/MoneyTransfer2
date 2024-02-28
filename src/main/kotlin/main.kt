package ru.netology

import kotlin.math.max
const val ERROR_TYPE = -1
const val ERROR_LIMIT = -2


fun main () {
    println(comission("Visa", 10_000, 0))
    println(comission("Мир", 15_000, 0))
    println(comission("Mastercard", 150_000, 0))

}
fun comission(typeCard : String, transfer: Int, previous:Int): Int = when (typeCard){
    "Visa" -> if (transfer < 150_000 && transfer + previous <= 600_000) {
        max(35, (transfer * 0.0075).toInt())
    }else {
        ERROR_LIMIT
    }
    "Mastercard" -> if (300 <= transfer + previous && transfer + previous <= 75_000) {
        0
    }else {
        ((transfer - 75_000) * 0.006 + 20).toInt()
    }
    "Мир" -> 0
    else -> ERROR_TYPE
}