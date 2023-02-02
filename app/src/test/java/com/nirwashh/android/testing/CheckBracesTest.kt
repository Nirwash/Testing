package com.nirwashh.android.testing

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class CheckBracesTest {
    /**
     * check if the braces set correctly
     * "(a + b))" or "(((a + b" return false
     */

    @Test
    fun `if count of open braces not equal count of close braces return false`() {
        val result = CheckBraces.check("(a + b))")
        assertThat(result).isFalse()
    }
}