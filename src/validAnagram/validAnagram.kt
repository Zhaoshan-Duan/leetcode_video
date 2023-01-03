package validAnagram

fun main() {
    val (s, t) = Pair("anagram", "nagaram")

    Solution().isAnagramHashMap(s,t)
    Solution().isAnagramSort(s,t)

}


class Solution {
    fun isAnagramHashMap(s: String, t: String): Boolean {
        // Time: O(n)
        // Space: O(n)
        if (s.length != t.length) return false

        val (sMap, tMap) = Pair(mutableMapOf<Char, Int>(), mutableMapOf<Char, Int>())

        for (i in s.indices) {
            sMap[s[i]] = 1 + sMap.getOrDefault(s[i], 0)
            tMap[t[i]] = 1 + tMap.getOrDefault(t[i], 0)
        }

        for (key in sMap.keys) {
            if (sMap[key] != tMap[key]) return false
        }

        return true
    }

    fun isAnagramSort(s: String, t: String):Boolean{
        // Time: O(nlogn)
        // Space: O(n)
        val (s1, t1) = Pair(s.toCharArray(), t.toCharArray())

        s1.sort()
        t1.sort()

        return s1.contentEquals(t1)
    }
}