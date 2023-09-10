/*Task
Write a program which does the following

Run loop from 0 to 15
Stop execution when the value of i reaches 13*/
fun main(args : Array<String>) {
    for(i in 0..15){
        if(i == 13){
            break
        }
        println(i)
    }
}