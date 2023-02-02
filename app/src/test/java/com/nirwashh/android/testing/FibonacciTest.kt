package com.nirwashh.android.testing


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class FibonacciTest {

    /**
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n-2) + fib(n-1)
     * n>1
     * */

    @Test
    fun `if n = 0 should return it`() {
        val result = Fibonacci.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `if n = 1 should return it`() {
        val result = Fibonacci.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `if n less than 0 should return 0`() {
        val result = Fibonacci.fib(-111)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `if n = 11 should return fibonacci(11)`() {
        val result = Fibonacci.fib(11)
        assertThat(result).isEqualTo(89)
    }



}