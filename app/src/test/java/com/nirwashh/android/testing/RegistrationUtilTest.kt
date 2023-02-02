package com.nirwashh.android.testing


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    /** Ввод не валидный если:
     * - имя пользователя или пароль пусты,
     * - имя пользователя уже существует,
     * - пароль и подтвержденный пароль не соотвествуют друг другу,
     * - пароль меньше двух цифр
     * */

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Nirwash",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Andrew",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Nirwash",
            password = "",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `empty confirmed password return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Nirwash",
            password = "123",
            confirmedPassword = ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirm password return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Nirwash",
            password = "123",
            confirmedPassword = "124"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digit password return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Nirwash",
            password = "1dfgdfg",
            confirmedPassword = "1dfgdfg"
        )
        assertThat(result).isFalse()
    }
}

