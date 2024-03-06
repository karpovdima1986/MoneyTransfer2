package ru.netology

import kotlin.math.max

const val ERROR_TYPE = -1
const val ERROR_LIMIT = -2
fun main() {
    println("Комиссия " +  comission(50_000, "Visa") + " рублей")
}

//fun condition(typeCard : String,transfer: Int, previous:Int ) {
//    if (transfer < 150_000 && transfer + previous <= 600_000)
//        comission(transfer,typeCard, previous)  else ERROR_LIMIT
//}

fun comission(transfer: Int ,typeCard : String = "Мир" , previous:Int = 0 ): Int {
    
//    return (typeCard)  if (transfer < 150_000 && transfer + previous <= 600_000)
//        comission(typeCard, transfer, previous)  else ERROR_LIMIT


     return when (typeCard) {
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
    }






