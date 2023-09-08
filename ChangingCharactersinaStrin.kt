fun main(args : Array<String>) {
    var word = "Ocygen"
    var mutableString = StringBuilder(word)
    mutableString[1] = 'x'
    print(mutableString)
}
/*nitialise a string variable word and assign the value "Ocygen" to it.
You now want to fix the typo in the given string.
Use the syntax explained above to replace 'c' with 'x' in the variable word
Output the updated ord to console*/