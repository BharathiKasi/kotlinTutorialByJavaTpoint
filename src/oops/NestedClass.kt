package oops

/**
 * Nested class will be presented inside the another class.
 * Nested class by default static so we no need to create an object to access it's data member and member function.
 * We cannot access outer class data member and member function in nested class.
 */
class NestedClass {
    val lValue = "Hai Bharathi."
    fun printlValue(){
        println(lValue)
    }
     class NestedClass2{
        val lNestedClass2Value = "Hey Bharathi.."
        fun printlNestedClass2Value(){
            println(lNestedClass2Value)
        }
    }

}

/**
 * since NestedClass2 is static class
 */
fun main(){
    val lNestedClass = NestedClass()
    lNestedClass.printlValue()
   val lNestedClass2 = NestedClass.NestedClass2()
    lNestedClass2.printlNestedClass2Value()

}