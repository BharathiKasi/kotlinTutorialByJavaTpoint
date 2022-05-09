package oops

/**
 * Inner class concept is similar to nested class. But the difference is
 * here will start inner class classname.
 * How it is better than nested class is here we have accessbility to access the  outer class data members and also member function.
 * Even if it is private variable or function we can use inside the inner class.
 */
class InnerClass {
    private val lInnerClassValue = "Hey Inner class 1"
     fun printInnerClassValue(){
        println(lInnerClassValue)
    }

    inner class InnerClass2{
        private var lInnerClass2Value = "Hey Inner class 2"
         fun printInnerClassValue2(){
            println(lInnerClass2Value)
            println("outer class data member valueis "+lInnerClassValue)  //we using outer class variable.
            printInnerClassValue()  // we are using outer class method
        }
    }
}

fun main(){
    val lInnerClass2 =InnerClass().InnerClass2()
    lInnerClass2.printInnerClassValue2()


}