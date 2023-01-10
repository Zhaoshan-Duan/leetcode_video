package twoSum_1

fun main() {
    val input = intArrayOf(3, 2, 4)
    val target = 6

    Solution().twoSumBruteForce(input, target).contentToString().apply { print(this) }
    Solution().twoSumOneHashMap(input, target).contentToString().apply { print(this) }
}


class Solution {
    // Approach 1: Brute Force
    //  Time: O(n^2)
    //  Space: O(1)
    fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {

        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf(0, 0)
    }

    // Approach 2: One pass with Hash Map
    //  Time: O(n)
    //  Space: O(n)
    fun twoSumOneHashMap(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        nums.forEachIndexed { i, num ->
            map[target - num]?.let { return intArrayOf(i, map[target - num]!!) }
            map[num] = i
        }

        return intArrayOf()
    }
}