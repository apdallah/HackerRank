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

// Complete the kaprekarNumbers function below.
fun kaprekarNumbers(p: Long, q: Long): Unit {
    var result = ""
        for (i in p..q) {
            val squaredStr = (i * i).toString()
            
            val lStr = squaredStr.substring(0, squaredStr.length / 2)
            val rStr = squaredStr.substring(squaredStr.length / 2, squaredStr.length)
            val l = if (lStr.isEmpty()) 0 else lStr.toLong()
            val r = rStr.toLong()
            val sum = l + r
            if (sum == i) result += "$i "
           
        }
        if (result.trim()
                .isEmpty()
        ) System.out.println("INVALID RANGE") else System.out.println(
            result
        )
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val p = scan.nextLine().trim().toLong()

    val q = scan.nextLine().trim().toLong()

    kaprekarNumbers(p, q)
}
