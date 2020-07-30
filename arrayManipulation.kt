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

// Complete the arrayManipulation function below.
fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {
       var result:Long=0
        var sum:Long=0
         val nList= MutableList<Long>(n+1){ 0 }
            for(i in queries.indices){
                val a=queries[i][0]
                val b=queries[i][1]
                val k=queries[i][2].toLong()
                nList[a-1]+=k
                nList[b]-=k
                
            }
         for (i in 0 until nList.size){
               sum+=nList[i]
            result=Math.max(result,sum)
        }


        return result

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")

    val n = nm[0].trim().toInt()

    val m = nm[1].trim().toInt()

    val queries = Array<Array<Int>>(m, { Array<Int>(3, { 0 }) })

    for (i in 0 until m) {
        queries[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = arrayManipulation(n, queries)

    println(result)
}
