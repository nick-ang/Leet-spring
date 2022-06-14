package com.example.leetcode

class MerchantProfitAnalysisReport {

    fun getLongestPeriod(array: List<Int>): Int? {
        if (array.isEmpty()) {
            return 0
        }

        var counter = 0
        val map = mutableMapOf<Int, Int>()

        array.forEachIndexed { index, element ->
            if (element == 1 && array.lastIndex != index) {
                counter += 1
            } else {
                if (array.lastIndex == index) {
                    counter += 1
                }
                map[index] = counter
                counter = 0
            }
        }

        return map.values.maxOrNull()!!
    }

}