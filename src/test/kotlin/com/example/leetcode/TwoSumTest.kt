package com.example.leetcode

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class TwoSumTest {

    private val test: TwoSum = TwoSum()

    @Test
    fun `two sum output is correct` () {
        t(intArrayOf(2, 7, 11, 15), 9, intArrayOf(0, 1))
        t(intArrayOf(3, 2, 4), 6, intArrayOf(1, 2))
    }


    private fun t(nums: IntArray, target: Int, expected: IntArray) {
        val actual = test.twoSum(nums, target)

        assertEquals(expected.size, actual.size)
        expected.forEachIndexed { index, i ->
            assertEquals(expected[index], i)
        }
    }
}