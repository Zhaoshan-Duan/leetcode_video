package twoSum

fun main() {
    val input = intArrayOf(2, 7, 11, 15)
    val target = 9

    // Solution().twoSumBruteForce(input, target).contentToString().apply { print(this) }
    Solution().twoSumOneHashMap(input, target).contentToString().apply { print(this) }
}


class Solution {
    // Approach 1: Brute Force
    //  Time: O(n^2)
    //  Space: O(1)
    fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {
        print("Brute Force Approach Running...: ")
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
    //  Space:: O(n)
//    fun twoSumOneHashMap(nums: IntArray, target: Int): IntArray {
//        print("One Pass with Hash Map Approach Running...")
//
//        val map = mutableMapOf<Int, Int>()
//
//        for (i in nums.indices){
//        }
//
//        return intArrayOf(0, 0)
//    }

}