import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    println(isPalindrom("lotibadri"))
    val n = 60


    minSplit(n)
    val list = ArrayList<Int>()
    list.add(1)
    list.add(5)
    list.add(8)
    println("\n" + notContains(list))

    val sequence = "([{}]))"

    if (isProperly(sequence)) println("True") else println("False")


    val s = 5
    println(countVariants(s))




}

//task1
fun isPalindrom(str: String): Boolean {
    var result = false
    for (i in 0..str.length / 2) {
        if (str[i] == str[str.length - (i + 1)]) {
            result = true
        } else {
            result = false
            break

        }
    }
    return result

}

//task2

var monetebi = intArrayOf(1, 2, 5, 10, 20, 50)
var n = monetebi.size
fun minSplit(amount: Int) {
    var amount = amount
    val ans = ArrayList<Int>()
    for (i in n - 1 downTo 0) {
        while (amount >= monetebi[i]) {
            amount -= monetebi[i]
            ans.add(monetebi[i])
        }
    }
    for (i in ans.indices) {
        print(" " + ans.elementAt(i))
    }
}


//task3
var result = 0
fun notContains(arrayList: ArrayList<Int>):Int{

    val intarray = ArrayList<Int>()
    for(i in arrayList){
        if (i>0){
            intarray.add(i)


        }
    }
    for(i in 0..intarray.size - 1){
        if(!intarray.contains(i)){
            result = i

        }
    }
    return  result



}


//task4

fun isProperly(sequence: String): Boolean {
    val stack: Deque<Char> = ArrayDeque()
    for (i in 0 until sequence.length) {
        val x = sequence[i]
        if (x == '(' ) {
            stack.push(x)
            continue
        }
        if (stack.isEmpty()) return false
        var check: Char
        when (x) {
            ')' -> {
                check = stack.pop()
            }
        }
    }
    return stack.isEmpty()
}


//task 5



fun fib(n: Int): Int {
    return if (n <= 1) n else fib(n - 1) + fib(n - 2)
}
fun countVariants(s: Int): Int {
    return fib(s + 1)
}


//task6














