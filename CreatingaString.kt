/*Strings are used for storing text.
A string variable contains a collection of characters surrounded by double quotes.
You do not have to specify that the variable should be a String. Kotlin is smart enough to understand that because of the double quotes.
However, just like with other data types, you can specify the type if you insist.

For example:

 var name = "Chef"              //Without mentioning the type of variable
 var name : String = "Chef"     //With mentioning the type of variable
Task
Write a program which does the following

Create a string named fruit and assign the value "Apple" to it.Output ruit to the console.*/
fun main(args : Array<String>) {
    var fruit = "Apple"
    print(fruit)
}