package com.example.leetcode

class ValidParenthesis {
    fun isValid(s: String): Boolean {
        val array = s.toCharArray()
        val mid = array.size / 2
        var j = mid
        var result = false
        val map = mapOf("(" to ')', '{' to '}', "[" to ']')
        if (mid % 2 != 0) {
            for (i in mid - 1 downTo 0) {
                if (map[array[i]] == array[j]) {
                    j += 1
                    if (j == array.size) {
                        result = true
                    }
                } else {
                    result = false
                }
            }
        } else {
            result = false
        }
        return result
    }
}
