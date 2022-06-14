package com.example.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MerchantProfitAnalysisReportTest {

    private val underTest: MerchantProfitAnalysisReport = MerchantProfitAnalysisReport()
    private val dateList = listOf("jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov ", "dec")

    @Test
    fun `should return int of largest profit`() {

        val array = listOf<Int>(1, 0, 1, 1, 0, 1, 1, 1, 0, 1)
        val expected = 3

        val result = underTest.getLongestPeriod(array)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 0 for empty`() {

        val array = listOf<Int>()
        val expected = 0

        val result = underTest.getLongestPeriod(array)

        assertEquals(expected, result)
    }

    @Test
    fun `should return when max is at end`() {

        val array = listOf<Int>(0, 0, 0, 0, 0, 1, 1, 1, 1, 1)
        val expected = 5

        val result = underTest.getLongestPeriod(array)

        assertEquals(expected, result)
    }

    @Test
    fun `should return when max is at start`() {

        val array = listOf<Int>(1, 1, 0, 0, 0, 0, 0, 0)
        val expected = 2

        val result = underTest.getLongestPeriod(array)

        assertEquals(expected, result)
    }

    @Test
    fun `should return when duplicate max is at middle`() {

        val array = listOf<Int>(0, 0, 0, 1, 1, 0, 0, 0)
        val expected = 2

        val result = underTest.getLongestPeriod(array)

        assertEquals(expected, result)
    }

    private val underTestII: MerchantProfitAnalysisReportII = MerchantProfitAnalysisReportII()

    @Test
    fun `should return int of largest profit with month`() {

        val array = listOf<Int>(1, 0, 1, 1, 0, 1, 1, 1, 0, 1)
        val expected = mutableListOf<String>("3, (jun - aug)")

        val result = underTestII.getLongestPeriodII(array,dateList)

        assertEquals(expected, result)
    }

    @Test
    fun `should return int of largest profit with single month`() {

        val array = listOf<Int>(1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        val expected = mutableListOf<String>("1, (jan - jan)")

        val result = underTestII.getLongestPeriodII(array,dateList)

        assertEquals(expected, result)
    }

    @Test
    fun `should return int of largest profit with double month`() {

        val array = listOf<Int>(1, 0, 0, 0, 0, 0, 0, 0, 0, 1)
        val expected = mutableListOf<String>("1, (jan - jan)", "1, (oct - oct)")

        val result = underTestII.getLongestPeriodII(array,dateList)

        assertEquals(expected, result)
    }

    private val underTestIII: MerchantProfitAnalysisReportIII = MerchantProfitAnalysisReportIII()

    @Test
    fun `should return int of largest profit with double month with sum`() {

        val array = listOf<Int>(1, 1, 1, 1, 0, 2, 2, 2, 0, 1)
        val expected = mutableListOf<String>("6, (jun - aug)")

        val result = underTestIII.getLongestPeriodIII(array,dateList)

        assertEquals(expected, result)
    }

    @Test
    fun `should return int of largest profit with double month with largest sum`() {

        val array = listOf<Int>(1, 0, 9, 1, 0, 2, 2, 2, 0, 1)
        val expected = mutableListOf<String>("10, (mar - apr)")

        val result = underTestIII.getLongestPeriodIII(array,dateList)

        assertEquals(expected, result)
    }


    private val underTestIV: MerchantProfitAnalysisReportIV = MerchantProfitAnalysisReportIV()

    @Test
    fun `should return int of largest profit with double month with largest profit loss sum`() {

        val array = listOf<Int>(31, -41, 59, 26, -53, 58, 97, -93, -23, 84)
        val expected = mutableListOf<String>("187, (mar - jul)")

        val result = underTestIV.getLongestPeriodIV(array,dateList)

        assertEquals(expected, result)
    }
}
