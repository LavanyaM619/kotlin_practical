/*Write a program which does the following
Create integer variables b  - the marks scored by Bob and Rob
Initialise b and r as b = 23 and r = 45
Compute and output the following to the console
"Rob Scored higher marks than Bob" if r is greater than b
"Bob & Rob both scored the same" if both b and r are equal
Update the values of b and r as b = 15 and r = 15
Compute and output the following to the console
"Rob Scored higher marks than Bob" if r is greater than b
"Bob & Rob both scored the same" if both b and r are equal*/
fun main(args : Array<String>) {
    var b = 23
    var r = 45
    if(r > b){
        println("Rob Scored higher marks than Bob.")
    }
    else if(r == b){
        println("Bob & Rob both scored the same")
    }

    b = 15
    r = 15
    if(r > b){
        println("Rob Scored higher marks than Bob.")
    }
    else if(r == b){
        println("Bob & Rob both scored the same")
    }
}