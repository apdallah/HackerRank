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

// Complete the appendAndDelete function below.
fun appendAndDelete(s: String, t: String, k: Int): String {
        var result = "No"
        var tempT = t
        var removed = 0
        if (tempT.isNotEmpty()) {
            while (!s.startsWith(tempT)) {
                tempT = tempT.dropLast(1)
                removed++
            }
        }
        val charctersToAdd = s.substring(tempT.length, s.length)
        val movesNumber = charctersToAdd.length + removed
        if (movesNumber <= k) {
            result = "Yes"
        } else {
            result = "No"
        }
                
        return result
        
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val t = scan.nextLine()

    val k = scan.nextLine().trim().toInt()

    val result = appendAndDelete(s, t, k)

    println(result)
}
