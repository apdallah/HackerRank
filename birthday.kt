import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
        var x = 0
        var result = 0
        var tempSum = 0
        var mCount = 0

        while (x < s.size) {
            var tempCount = x
            while (mCount < m && tempCount<s.size) {
                tempSum += s[tempCount]
                tempCount++
                mCount++
            }
            mCount=0
            // System.out.println("$tempSum")
            if (tempSum == d) result++
             tempSum = 0
            x++
        }
return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
