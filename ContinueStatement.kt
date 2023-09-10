/*input 5
Output

0
1
2
3
4
6
7
8
9
10
11
12*/
//Solution as follows

fun main(args : Array<String>) {
    var n = readLine()!!.toInt()
    for(i in 0..12){
        if(i == n){
            continue
        }
        println(i)
    }
}