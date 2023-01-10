package groupAnagrams_49

fun main() {
    val input = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    Solution().groupAnagramsCharArray(input).apply { print(this) }
}

class Solution {
    // Time: O(26 * m * n)
    // Space: O(n)
    fun groupAnagramsCharArray(strs: Array<String>): List<List<String>> {

        val res = mutableMapOf<List<Int>, MutableList<String>>()

        strs.forEach { word ->
            val count = MutableList<Int>(26) {0}

            word.forEach {
                count[it - 'a']++
            }

            res[count] = res.getOrDefault(count, mutableListOf()).also { it.add(word) }
        }

        return res.values.toList()
    }
}