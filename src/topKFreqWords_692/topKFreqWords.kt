package topKFreqWords_692

fun main(){
    val words = arrayOf<String>("i","love","leetcode","i","love","coding")
    val k = 2

    Solution().topKFrequent(words, k).apply{print(this)}
}

class Solution {
    fun topKFrequent(words: Array<String>, k: Int): List<String> {

        val wordsCopy = words.toList()
        val freq = MutableList<MutableList<String>>(words.size){ mutableListOf() }

        val res = mutableListOf<String>()

        val count = wordsCopy.groupingBy{it}.eachCount()

        count.forEach{
            freq[it.value].add(it.key)
        }

        freq.asReversed().forEach{wordList ->
            wordList.sort()
            wordList.forEach(){
                res.add(it)
                if(res.size == k) return res.toList()
            }
        }

        return listOf()
    }
}