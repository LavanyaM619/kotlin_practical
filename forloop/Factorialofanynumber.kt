/* input 6
output 
he factorial of the given number is: 720
Factorial of a number(n) = n×(n−1)×...2×1n×(n−1)×...2×1*/
//Solution as follows

fun main(args : Array<String>) {
    var num = readLine()!!.toInt()
    var fact = 1
    for(i in 1..num){
        fact = fact * i
    }
    print("The factorial of the given number is: $fact")
}