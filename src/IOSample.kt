import java.lang.NumberFormatException
import java.util.*

fun main(){
    val lAge = getAge()
    println("your age is $lAge")
  println("Enter your name ...")
  val lName = readLine()
  println("Your nameis $lName")

    //getting input from user using scanner
    print("Maritial Status? 1.Yes or 2.No")
    val lscanner = Scanner(System.`in`)
    val lIsMarried = lscanner.nextInt()
    print("you'r ${if (lIsMarried==1) "married" else "not married"}")
}


fun getAge():Int{
    println("Enter the age...")
    val lAge = readLine()
   /* if (lAge != null) {
        lAge.toIntOrNull()?.let {true}?:false
    }*/
    try {
        val ll = Integer.valueOf(lAge)
        return ll
    }catch (e:NumberFormatException){
        println("Enter the valid age...")
        getAge()
    }

    return 0
}