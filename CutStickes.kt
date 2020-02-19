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

// Complete the cutTheSticks function below.
fun cutTheSticks(arr: Array<Int>): Array<Int> {
    var inputs = arr.toCollection(ArrayList())
    val inputsProcess = ArrayList<Int>()
    val result = ArrayList<Int>()

    result.add(inputs.size)
    inputs.sort()
    while (inputs.size > 1) {
        var i = 0
        inputsProcess.clear()
        while (i < inputs.size) {
            if (inputs[i] - inputs[0] != 0) inputsProcess.add(inputs[i] - inputs[0])
            i++
        }

        inputs.clear()
        inputs.addAll(inputsProcess)
        result.add(inputs.size)
    }

    return result.toTypedArray()
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = cutTheSticks(arr)

    println(result.joinToString("\n"))
}
