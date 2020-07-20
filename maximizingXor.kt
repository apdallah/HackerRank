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

// Complete the maximizingXor function below.
fun maximizingXor(l: Int, r: Int): Int {
    
       var result = 0
        for (i in l..r) {
            for (j in i..r) {
                val tempMax=j xor(i)
                if(tempMax>result)result=tempMax
            }
        }
        return result

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val l = scan.nextLine().trim().toInt()

    val r = scan.nextLine().trim().toInt()

    val result = maximizingXor(l, r)

    println(result)
}
