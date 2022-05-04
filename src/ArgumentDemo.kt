fun main(){
    //default argument demo...
    testing() // we are not passing here any parameter so, the compiler will take the default value for the testing method.
    testing(100,) //We are passing only first parameter so the compiler will take second param as default value
    /**
     * Uncomment the below line you will error.
     * We are passing only pStringValue in the function call but the compiler assume that you passing value for pIntValue
     * so, pIntValue is type of int but we are sending string that is what the compiler showing error.
     * To fix this we have to use named argument
     */
    //testing("Bharathi")
    testing(pStringValue = "Bharathi kasi...")
}

private fun testing(pIntValue:Int = 0,pStringValue:String = ""){
    println("the pIntValue is $pIntValue and also pStringValue is $pStringValue")
}