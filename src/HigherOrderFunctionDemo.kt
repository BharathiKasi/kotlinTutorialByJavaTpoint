/**
 * Higher order function is nothing but, sending lamda expression as a parameter or return lambda expression as parameter.
 */
fun main(){
    val lHigherOrderFun:(String,String) ->String = { p1,p2 ->
        "$p1 $p2 How areyou"
    }
    higherOrderFunctionTest(10,"Testing",lHigherOrderFun)
}

/**
 * Here we are getting three parameters Int,String,lambda as paramter.
 */
private fun higherOrderFunctionTest(pIntValue:Int,pStringValue:String,pHigherOrderFunction:(String,String)->String){
   val lResult=  pHigherOrderFunction("Hai","Bharathi")
    println("$lResult")
}