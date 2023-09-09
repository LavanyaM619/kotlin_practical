//Solution as follows

fun main(args : Array<String>) {
    var z : Int = 0
    var x : Int = 0
    var c : Int = 0
    readLine()!!.split(' ')!!.map{it.toInt()}!!.let{
        z = it[0]
        x = it[1]
        c = it[2]
        if(c > x || c > z){
            println("PASS")
        }
        else{
            println("FAIL")
        }
    }

    readLine()!!.split(' ')!!.map{it.toInt()}!!.let{
        z = it[0]
        x = it[1]
        c = it[2]
        if(c > x || c > z){
            println("PASS")
        }
        else{
            println("FAIL")
        }
    }
}