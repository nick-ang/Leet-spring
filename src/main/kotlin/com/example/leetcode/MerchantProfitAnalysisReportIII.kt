package com.example.leetcode

class MerchantProfitAnalysisReportIII {

    companion object {

    }

    fun getLongestPeriodIII(profitArray: List<Int>, dateList: List<String>): MutableList<String> {

        if (profitArray.isEmpty()) {
            return mutableListOf<String>("empty")
        }

        var counter = 0
        var startIndex = 0
        val mapOfIndexToTotalProfit = mutableMapOf<Pair<Int, Int>, Int>()

        profitArray.forEachIndexed { index, element ->
            if (element != 0 && profitArray.lastIndex != index) {
                counter += element
                // increment by element instead of number is better at the start
            } else {
                if (profitArray.lastIndex == index && element != 0) {
                    counter += element
                    mapOfIndexToTotalProfit[Pair(startIndex, index)] = counter
                } else {
                    mapOfIndexToTotalProfit[Pair(startIndex, index-1)] = counter
                    counter = 0
                    startIndex = index + 1
                }
            }
        }

        val result = mutableListOf<String>()
        val max = mapOfIndexToTotalProfit.values.maxOrNull()!!
        mapOfIndexToTotalProfit.filter { it.value == max }
            .forEach {
                result.add("${it.value}, (${dateList.get(it.key.first)} - ${dateList.get(it.key.second)})")
            }
        return result
    }

}