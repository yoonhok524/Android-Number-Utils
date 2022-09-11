package com.aaron.utils.number

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DollarTextTest {

    @Test
    fun toDollarTextTest() {
        assertEquals("$10", 10.toDollarText())
        assertEquals("$10.5", 10.5F.toDollarText())
        assertEquals("$10.5", 10.5.toDollarText())
    }
}