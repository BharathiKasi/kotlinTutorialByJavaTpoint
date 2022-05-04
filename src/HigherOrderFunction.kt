fun main(){
   basicHigherOrderFunction {
       10 + 20
   }
}
fun basicHigherOrderFunction(myFunction: () -> Int) {
    println("Start my Function!")
    print("the myfunciton is ${myFunction()}")
    println("Function finished")
}