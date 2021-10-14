package com.aaron.utils.number


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