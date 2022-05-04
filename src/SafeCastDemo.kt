class SafeCastDemo {

    /**
     * This will throw NullPointerExceaption "null cannot be cast to non-null type kotlin.String"
     */
    fun smartCastNullToString(){
        val lString:Any? = null
        val lString2 = lString as String
        println("the lstring2 is ${lString2}")
    }

    /**
     * This will throw classCastException "class java.lang.Integer cannot be cast to class java.lang.String"
     */
    fun smartCastIntToString(){
        val lValue:Any = 1234
        val lValue2 = lValue as String
        println("the lvalue2 is ${lValue2}")
    }

    /**
     *This will work but it is unsafe.
     */
    fun smartUnsafeCast(){
        val lUnsafeValue1 :Any?= "Unsafe cast "
        val lUnsafeValue2 = lUnsafeValue1 as String?
        println("the lUnsafeValue2 is ${lUnsafeValue2}")
    }

    /**
     * This is safe cast.
     * This as? will perform safe cast if it is valid else it will assign null value to the varialbe. Here the advantage is
     * it won't throw any exception.
     */
    fun safeCast(){
        val lSafeValue1:Any? = 1234
        val lSafeValue2:String? = lSafeValue1 as? String
        println("the safe cast is ${lSafeValue2}")
    }

}
fun main(){
    val lSafeCastDemo = SafeCastDemo()
    //lSafeCastDemo.smartCastNullToString()
    //lSafeCastDemo.smartCastIntToString()
    lSafeCastDemo.smartUnsafeCast()
    lSafeCastDemo.safeCast()
}