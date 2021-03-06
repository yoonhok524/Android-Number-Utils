package com.aaron.utils.number

import kotlin.math.pow
import kotlin.math.round

fun Float?.toDollarText(
    prefix: String = "$",
    default: String = "-",
digit: Int = 2): String {
    return if (this == null) {
        default
    } else {
        "${prefix}${decimalFormat.format(this.round(digit))}"
    }
}

fun Float.round(digit: Int = 2): Float {
    val v = 10F.pow(digit)
    return round(this * v) / v
}