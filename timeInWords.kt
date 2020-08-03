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

// Complete the timeInWords function below.
fun timeInWords(h: Int, m: Int): String {

var result = ""
        var hour=h
        val n = arrayOf("zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six",
            "twenty seven", "twenty eight", "twenty nine", "half")
        val hWord=if(m<=30)n[hour] else{
            if(hour==12)hour=0
            n[hour+1]
        }
        val mWord = if (m <= 30) n[m] else n[60-m]
        when {
            m==0 -> {
                result="$hWord o' clock"
            }
            m<=30 -> {
                result = if(m==30||m==15){
                    "$mWord past $hWord"
    
                }else if(m<10){
                    "$mWord minute past $hWord"
                }else {
                    "$mWord minutes past $hWord"
                }
            }
            m>30 -> {
                result = if(m==45){
                    "$mWord to $hWord"
                }else {
                    "$mWord minutes to $hWord"
    
                }
    
            }
        }
         return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val h = scan.nextLine().trim().toInt()

    val m = scan.nextLine().trim().toInt()

    val result = timeInWords(h, m)

    println(result)
}
