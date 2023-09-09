/*Write a program which does the following

Let's think of a real-life example where we need to find out if a person is old enough to vote.
Find out if the age (25) is greater than OR equal to the voting age limit, which is set to 18.
Declare the variables  and vage - and initialise them to the values 25
25 and 18 - i.e. the age and the voting age respectively.
Compareage and vage using the syntax given above and output the following
"Old enough to vote!" if age is greater than or equal to vage
"Not old enough to vote." if age is lesser than vage*/
fun main(args : Array<String>) {
    var age = 25
    var vage = 18
    if(age >=vage){
        print("Old enough to vote!")
    }
    else{
        print("Not old enough to vote.")
    }
}