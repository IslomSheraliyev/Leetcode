package september

class Solution1 {
    fun construct2DArray(
        original: IntArray,
        m: Int,
        n: Int
    ): Array<IntArray> {

        if (m * n != original.size) return arrayOf()

        val res = Array(m) { IntArray(n) }

        for (i in 0..<m) {
            res[i] = original.sliceArray(i * n ..< (i + 1) * n)
        }

        return res
    }
}

