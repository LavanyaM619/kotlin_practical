/*If we want any other text in between the outputs we can simply write that text inside the print statement because an entire statement is written in "" and it acts as a string.

Task
Write a program which does the following

Output the result of 3 + 4
Output the result of 2 + 1 on the same line
Insert the text "and" between the outputs.
Note: We have a space before and after the text as well, as without those, the output would be "7and3", instead of "7 and 3".
*/
//Solution

fun main(args : Array<String>) {
    print("${3+4} and ${2+1}")   
}