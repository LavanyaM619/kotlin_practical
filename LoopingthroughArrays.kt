/*Task
Write a program which does the following

Declare a string array x and initialise it to letters of the word - 'CODING'
Output the following to the console on separate lines
Index number of each element in the array and the element itself*/
//Solution as follows

fun main(args : Array<String>) {
    val x = arrayOf("C", "O", "D", "I", "N", "G")
    for (i in 0 until x.size) { //until is a range operator in Kotlin that creates a range from a starting value (inclusive) up to, but not including, an ending value.
        println("$i = ${x[i]}")
    }
}