package com.aaron.utils.number

import kotlin.math.pow
import kotlin.math.round

fun Float.round(digit: Int = 2): Float {
    val v = 10F.pow(digit)
    return round(this * v) / v
}