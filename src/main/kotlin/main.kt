package ru.netology

import kotlin.math.max

const val ERROR_TYPE = -1
const val ERROR_LIMIT = -2
fun main() {
    val typeCard = "Мир"
    val transfer = 80_000
    val previous = 0

    val comission = when (typeCard) {
        "Visa" -> max(35, (transfer * 0.0075).toInt())
        "Mastercard" -> if (previous > 75_000) {
            (transfer * 0.006 + 20).toInt()
        } else if (transfer + previous < 75_000) {
            0
        } else {
            ((previous + transfer - 75_000) * 0.006 + 20).toInt()
        }
        "Мир" -> 0
        else -> ERROR_TYPE
    }
    val condition = if (transfer < 150_000 && transfer + previous <= 600_000) comission else ERROR_LIMIT

    println(condition)
}



