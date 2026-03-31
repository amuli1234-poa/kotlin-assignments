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

var studentName:String="Alex Morgan" //mutable meaning it can always change

val studentID:Int = 2024001 //it is immutable

var GPA :Float = 3.75f //mutable

val isEnrolled :Boolean = true //immutable

var middleInitial:String = "J" // imutable

val studentInfo= "student:$studentName J (ID:$studentID) has GPA $GPA and is enrolled: $isEnrolled"

   var phoneNumber: String? = null

    
fun displayMenu(){
    println("====MENU====")
    println("1.view profile")
    println("2.Edit settings")
    println("3.Logout")
    println("=============")
}
fun calculateDiscount(price:Double,discountPercent:Double):Double{
    
   val discountedPrice = price - (price * discountPercent/100)
   
        println(discountedPrice)
   
    return discountedPrice
   

}

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