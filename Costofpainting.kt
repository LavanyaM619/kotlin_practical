/*Write a program which does the following
find the area of a square of side 14cm.
Also, find the cost of painting the square if the paint costs is 7$ cm/sq.
Initialise the following variables in your program and use them in the computation.
s to store the length of side the square
area to store the area of the square
cost to store the cost of painting
Output area and cost to the console on separate lines.
Note: Include the character "$" with the  without any space*/
fun main(args : Array<String>) {
    var s = 14
    var area = s * s
    var cost = area * 7
    println(area)
    print("${cost}$")
}