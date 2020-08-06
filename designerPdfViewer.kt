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

// Complete the designerPdfViewer function below.
fun designerPdfViewer(h: Array<Int>, word: String): Int {

val indexes= hashMapOf<Char,Int>()
        indexes.put('a',0)
        indexes.put('b',1)
        indexes.put('c',2)
        indexes.put('d',3)
        indexes.put('e',4)
        indexes.put('f',5)
        indexes.put('g',6)
        indexes.put('h',7)
        indexes.put('i',8)
        indexes.put('j',9)
        indexes.put('k',10)
        indexes.put('l',11)
        indexes.put('m',12)
        indexes.put('n',13)
        indexes.put('o',14)
        indexes.put('p',15)
        indexes.put('q',16)
        indexes.put('r',17)
        indexes.put('s',18)
        indexes.put('t',19)
        indexes.put('u',20)
        indexes.put('v',21)
        indexes.put('w',22)
        indexes.put('x',23)
        indexes.put('y',24)
        indexes.put('z',25)

        var max=0
        word.toCharArray().forEach {
            if(max<h[indexes[it] ?:-1])max=h[indexes[it] ?:-1]
        }
        return max*word.length
        }

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val h = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val word = scan.nextLine()

    val result = designerPdfViewer(h, word)

    println(result)
}
