package containsDuplicate

fun main() {
    val input = intArrayOf(1, 2, 3, 1)

    Solution().containsDuplicateSet(input).apply { print(this) }
}


class Solution {
    fun containsDuplicateSet(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()

        nums.forEach {
            if (!set.add(it)) return true else set.add(it)
        }
        return false
    }
}