/*Write a program which does the following

Create a string array for the following values "Monday", "Tuesday", "Wednesday", and "Thursday"
Output the last two elements of the array on separate lines*/

fun main(args : Array<String>) {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday")
    println(week[2])
    print(week[3])
}