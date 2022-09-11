package com.aaron.utils.number

fun Number?.toDollarText(
    prefix: String = "$",
    default: String = "-",
    digit: Int = 2): String {
    return if (this == null) {
        default
    } else {
        "${prefix}${decimalFormat.format(this.toFloat().round(digit))}"
    }
}