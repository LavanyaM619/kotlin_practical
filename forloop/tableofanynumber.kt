/*iput 5
Output

5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50*/
//Solution as follows

fun main(args : Array<String>) {
    var n = readLine()!!.toInt()
    for(i in 1..10){
        println("$n x $i = ${n * i}")
    }
}