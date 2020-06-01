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

// Complete the migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int {
     var result = 0
        val res = arr.groupBy { it }
        var currentMax = 0
        res.forEach {

            if (it.value.size > currentMax) {
                currentMax = it.value.size
                result = it.key
            }else if(it.value.size==currentMax){
                if(it.key<result)result=it.key
            }
        }
        return result

}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
