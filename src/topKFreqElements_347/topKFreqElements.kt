package topKFreqElements_347

fun main() {
    val input = intArrayOf(1, 1, 1, 2, 2, 3, 3)
    val k = 2
    Solution().topKFrequentBucketSort(input, k).contentToString().apply { print(this) }

}

class Solution {

    // Time: O(n)
    // Space: O(n)
    fun topKFrequentBucketSort(nums: IntArray, k: Int): IntArray {

        val numList = nums.toList() // O(n)
        val res =
            mutableListOf<Int>() // use list for now since we don't know the size, cast to int array when returning

        val freq = MutableList<MutableList<Int>>(nums.size + 1) { mutableListOf() }

        numList.groupingBy { it }.eachCount()
            .forEach { freq[it.value].add(it.key) }

        freq.asReversed()
            .forEach { num ->
                num.forEach {
                    res.add(it)
                    if (res.size == k) return res.toIntArray()
                }
            }
        return intArrayOf()
    }
}
