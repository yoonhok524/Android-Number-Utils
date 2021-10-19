package com.aaron.utils.number

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FloatsTest {

    @Test
    fun roundTest() {
        val num: Float = 10.123456789F
        assertEquals(10.12F, num.round())
        assertEquals(10.1F, num.round(1))
        assertEquals(10.12F, num.round(2))
        assertEquals(10.123F, num.round(3))
        assertEquals(10.1235F, num.round(4))
    }
}