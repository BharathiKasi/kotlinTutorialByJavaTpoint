//this program will teach you what is recursion..
//Basically, the same method will call continuously to achieve some task.
fun main(){
    println(factorial(5))
    println(sumOfLargeNumbers(100000))
}


fun factorial(n:Int):Long{

   return if (n==1){
        return n.toLong()
    }else{
       n*factorial(n-1)
    }
}

//When we run this method will get stackOverflowError because the compiler is taking to much
// work so the method stack is getting overflow.
fun sumOfLargeNumbers(n:Long):Long{
   return if (n<1){
        return n
    }else{
        n+sumOfLargeNumbers(n-1)
   }
}

