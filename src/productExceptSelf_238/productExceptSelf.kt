package productExceptSelf_238

fun main(){
    val input = intArrayOf(1,2,3,4)

    Solution().productExceptSelf(input).apply { print(this) }
}


class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        var (pre, post) = Pair(1, 1)
        val res = MutableList(nums.size) { 1 }

        nums.forEachIndexed { i, num ->
            res[i] = pre
            pre *= num
        }

        for (i in nums.indices.reversed()) {
            res[i] *= post
            post *= nums[i]
        }

        return res.toIntArray()
    }
}