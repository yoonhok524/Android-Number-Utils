package com.aaron.utils.number

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test


class CommonsTest {

    @Nested
    @DisplayName("toSafeInt() test")
    inner class ToSafeIntTest {
        @Test
        fun toSafeIntTest() {
            assertEquals(1, "1".toSafeInt())
            assertEquals(0, "".toSafeInt())
            assertEquals(100, "".toSafeInt(100))
            assertEquals(-1, "-1".toSafeInt())
            assertEquals(999, " 999 ".toSafeInt())
            assertEquals(0, " 12 34 ".toSafeInt())
            assertEquals(5, " 12 34 ".toSafeInt(5))
        }
    }
}