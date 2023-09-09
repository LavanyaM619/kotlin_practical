//Solution as follows

fun main(args : Array<String>) {
    var a: Int = 0
    var b: Int = 0
    var c: Int = 0

    // First input
    readLine()?.split(' ')?.map { it.toInt() }?.let {
        a = it[0]
        b = it[1]
        c = it[2]
        if (a > c) {
            println("Bravo!")
        } else {
            println("Try Again")
        }
    }

    // Second input
    readLine()?.split(' ')?.map { it.toInt() }?.let {
        a = it[0]
        b = it[1]
        c = it[2]
        if (a > c) {
            print("Bravo!")
        } else {
            print("Try Again")
        }
    }
}/*intput
25 21 52
35 23 34
Output
Try Again
Bravo!*/