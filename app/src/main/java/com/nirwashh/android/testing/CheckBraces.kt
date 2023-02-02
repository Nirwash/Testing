package com.nirwashh.android.testing

object CheckBraces {

    fun check(string: String): Boolean {
        return string.count { it == '(' } == string.count { it == ')' }
    }
}