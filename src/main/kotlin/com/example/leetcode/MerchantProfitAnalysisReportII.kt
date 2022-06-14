package com.example.leetcode

class MerchantProfitAnalysisReportII {

    companion object {

    }

    fun getLongestPeriodII(profitArray: List<Int>, dateList: List<String>): MutableList<String> {

        if (profitArray.isEmpty()) {
            return mutableListOf<String>("empty")
        }

        var counter = 0
        val map = mutableMapOf<Int, Int>()

        profitArray.forEachIndexed { index, element ->
            if (element == 1 && profitArray.lastIndex != index) {
                counter += 1
            } else {
                if (profitArray.lastIndex == index && element == 1) {
                    counter += 1
                    map[index + 1] = counter
                } else {
                    map[index] = counter
                    counter = 0
                }
            }
        }
        val result = mutableListOf<String>()
        val max = map.values.maxOrNull()!!
        map.filter { it.value == max }
            .forEach {
                result.add("${it.value}, (${dateList.get(it.key - it.value)} - ${dateList.get(it.key - 1)})")
            }
        return result
    }

}