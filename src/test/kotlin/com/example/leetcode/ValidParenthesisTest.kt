package com.example.leetcode

import org.assertj.core.api.SoftAssertions.assertSoftly
import org.junit.jupiter.api.Test

internal class ValidParenthesisTest {

    // instantiate the class
    private val validParenthesis = ValidParenthesis()

    @Test
    fun `Should return true if Open brackets must be closed by the same type of brackets`() {
        val s = "()"
        val expected = true
        val result = validParenthesis.isValid(s)
        assertSoftly { s ->
            s.assertThat(expected).isEqualTo(result)
        }
    }

    @Test
    fun `Should return true if Open brackets must be closed in the correct order`() {
        val s = "()[]{}"
        val expected = true
        val result = validParenthesis.isValid(s)
        assertSoftly { s ->
            s.assertThat(expected).isEqualTo(result)
        }
    }

    @Test
    fun `Should return false if Open brackets must be closed by different type of brackets`() {
        val s = "(]"
        val expected = false
        val result = validParenthesis.isValid(s)
        assertSoftly { s ->
            s.assertThat(expected).isEqualTo(result)
        }
    }

    @Test
    fun `Should return false if Open brackets must closed in incorrect order`() {
        val s = "([)]"
        val expected = false
        val result = validParenthesis.isValid(s)
        assertSoftly { s ->
            s.assertThat(expected).isEqualTo(result)
        }
    }
}
