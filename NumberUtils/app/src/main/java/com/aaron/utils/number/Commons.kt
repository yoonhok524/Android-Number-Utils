package com.aaron.utils.number

import java.text.DecimalFormat

internal val decimalFormat: DecimalFormat by lazy { DecimalFormat() }

fun String?.toSafeInt(default: Int = 0): Int {
    if (this.isNullOrBlank()) {
        return default
    }

    return try {
        this.trim().toInt()
    } catch (e: NumberFormatException) {
        default
    }
}

fun String?.toSafeFloat(default: Float = 0F): Float {
    if (this.isNullOrBlank()) {
        return default
    }

    return try {
        this.trim().toFloat()
    } catch (e: NumberFormatException) {
        default
    }
}