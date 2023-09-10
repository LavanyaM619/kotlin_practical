/*Task
Write a program which does the following

Create an array num which has the integers - 10, 20, 30, 40, 50, 60, 70, 80
Output to the console the following
All the elements of the given array in separate lines
Use the "for" loop syntax defined above*/
//Solution as follows

fun main(args : Array<String>) {
    val num = arrayOf(10, 20, 30, 40, 50, 60, 70, 80)
    for (i in num) {
        println(i)
    }
}