/*he '+' sign can be used between strings to add them together to make a new string.
This is called concatenation.
For eg -

var x = "Good"
var y = "Work"
print(x + y)
// output will be: GoodWork
Note: You can add spaces between words by using an empty " " with a space inside or by providing a space in the end of a word.
For eg -

var x = "Good"
var y = "Work"
print(x + " " + y)
// output will be: Good Work
Task
Write a program which does the following
Declare two variables x and y Assign the values "Hello" to variable x and "World" to variable y.
Output 
x and y to the console. Don't forget to add a space in between them.Your output will be Hello World*/

fun main(args : Array<String>) {
    var x = "Hello"
    var y = "World"
    print(x + " " + y)
}