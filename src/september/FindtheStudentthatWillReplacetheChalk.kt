package september

class Solution2 {
    fun chalkReplacer(chalk: IntArray, k: Int): Int {
        var chalkAmount = k
        var sum = 0

        for (i in chalk.indices) {
            if (chalkAmount < chalk[i]) return i
            chalkAmount -= chalk[i]
            sum += chalk[i]
        }


        return if (chalkAmount > 0) {
            chalkAmount %= sum
            var currentStudent = 0
            while (chalkAmount >= chalk[currentStudent % chalk.size]){
                chalkAmount -= chalk[currentStudent % chalk.size]
                currentStudent ++
            }
            currentStudent % chalk.size
        } else 0
    }
}

fun main() {
    println(Solution2().chalkReplacer(intArrayOf(5, 1, 5), 22))
    println(Solution2().chalkReplacer(intArrayOf(3, 4, 1, 2), 25))
}