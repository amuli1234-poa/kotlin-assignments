//sigle line comment 
/*
 * VARIABLES
 * -mutable=> you can always change
 * -immutable variables=> constant=> you can never change once assigned
 * Parts of a variable
 * -key word (var ,val)
 * -variable name
 * -data type
 * -assignment operator
 * -valueto be referenced
 * 
 * */ 
//DATA TYPES
var studentName:String="Alex Morgan" //mutable meaning it can always change

val studentID:Int = 2024001 //it is immutable

var GPA :Float = 3.75f //mutable

val isEnrolled :Boolean = true //immutable

var middleInitial:String = "J" // imutable

val studentInfo= "student:$studentName J (ID:$studentID) has GPA $GPA and is enrolled: $isEnrolled"

   var phoneNumber: String? = null

    //assignment: create a function that displays a menu with options for the user to choose from
fun displayMenu(){
    println("====MENU====")
    println("1.view profile")
    println("2.Edit settings")
    println("3.Logout")
    println("=============")
}
//assignment: create a function that takes in the price of an item and the discount percentage and returns the discounted price
fun calculateDiscount(price:Double,discountPercent:Double):Double{
    
   val discountedPrice = price - (price * discountPercent/100)
   
        println(discountedPrice)
   
    return discountedPrice
   

}
// assignment: create a function that takes in a score and returns the corresponding grade based on the following scale
fun getGrade(score:Int):String{
   return when (score){
        in 80..100 ->"A"
         in 65..79 ->"B"
         in 50..64 ->"C"
        in 35..49 ->"D"
        else ->"F"
       
    }
}
fun main() {
    
 println(studentInfo)
 println(phoneNumber)
displayMenu()
calculateDiscount(1200.123434,15.1323232)
println(getGrade(90))

}