class SmartCastDemo {
fun isString(pValue:Any) {
    if (pValue is String) {
        println("the pValue is string")
    } else {
        println("the pValue is not a string")
    }
}

    fun isNotString(pValue:Any){
        if(pValue !is String){
            println("the pValue is not a string")
        }else {
            println("the pValue is a string")
        }
    }
}



fun main(){
val lSmartCastDemo = SmartCastDemo()
    lSmartCastDemo.isString("Bharathi Kasi")
    lSmartCastDemo.isNotString(123)
}

