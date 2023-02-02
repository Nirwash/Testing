package com.nirwashh.android.testing

object Fibonacci {

    fun fib(n: Int): Long {
        return if (n <= 0) {
            0
        } else if (n == 1) {
            1
        } else {
            fib(n - 2) + fib(n - 1)
        }
    }
}