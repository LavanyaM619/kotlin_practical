/*Task
Write a program which does the following:

Find the area of a circle whose radius is 8.9 cm. Take pi = 3.14
Declare variables radius, pi and area and assign the relevant values to them
Note: Area of a circle is Pi×2radius 
2*/
fun main(args : Array<String>) {
    val pi : Double = 3.14  // we use val here because pi value is constant and we dont want to change it
    var radius : Double = 8.9
    var area : Double = pi * radius* radius
    print("The Area of the given Circle is $area")
}