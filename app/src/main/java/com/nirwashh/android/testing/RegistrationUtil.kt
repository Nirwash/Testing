package com.nirwashh.android.testing

object RegistrationUtil {

    private val existingUsers = listOf("Andrew", "Max")

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()) return false
        if (username in existingUsers) return false
        if (password != confirmedPassword) return false
        if (password.count { it.isDigit() } < 2) return false
        return true
    }
}