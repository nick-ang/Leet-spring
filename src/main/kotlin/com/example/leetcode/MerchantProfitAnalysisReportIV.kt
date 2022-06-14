package com.example.leetcode

class MerchantProfitAnalysisReportIV {

    fun getLongestPeriodIV(array: List<Int>, dateList: List<String>): MutableList<String> {
        var max_so_far = Int.MIN_VALUE
        var max_ending_here = 0
        var start = 0
        var end = 0
        var s = 0
        for (i in array.indices) {
            max_ending_here += array[i]
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here
                start = s
                end = i
            }
            if (max_ending_here < 0) {
                max_ending_here = 0
                s = i + 1
            }
        }
        val result = mutableListOf<String>()

        result.add("${max_so_far}, (${dateList.get(start)} - ${dateList.get(end)})")

        return result
    }

}