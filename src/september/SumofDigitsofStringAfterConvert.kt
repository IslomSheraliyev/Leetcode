package september

class Solution3 {
    fun getLucky(s: String, k: Int): Int {
        var converted = s.map { it.code - 96 }.joinToString("")
        var sum = 0

        for (i in 0..<k) {
            sum = 0
            converted.forEach { sum += it.toString().toInt() }
            converted = sum.toString()
        }

        return converted.toInt()
    }
}

fun main() {
    val solution = Solution3()
    println(solution.getLucky("iiii", 1))
    println(solution.getLucky("leetcode", 2))
}