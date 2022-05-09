package oops

/**
 * In kotlin we have four types of visiblillity modifier
 * 1. Private
 * 2.Public
 * 3.Protected
 * 4.Internal
 */


/**
 * Public modifier demo.
 *This is default modifier in kotlin. If we are not specifying the access modifier then,
 * compiler will consider public is modifier.
 * We can access public class,interface or method anywhere inside the project.
 */

public class VisibilityModifier {


    public val TAG = "VisibilityModifier"

    public fun testPublicModifier(){
        println("this is testPublicModifier")
    }
}

/**
 *This protected modifier only visible to its child and itself.
 * If we want to override the parent class protected method then we should make it as open.
 *
 */

open  class ProtectedModifierDemoClass{

    protected  open val lProtectedVariable = 10

    protected open fun testingProtectedMethod(){
        println("this is protected method...")
    }
}

 open class  SubClass : ProtectedModifierDemoClass() {

    protected open val lSubClassProtectedVariable = 12

    protected open fun subClassProtectedMethod(){
        println("this is subclass protected method...")
    }

    override open val lProtectedVariable: Int
        get() = 20


    override open fun testingProtectedMethod() {
        println("This is parent class overriden method in subclass")
    }


}

/**
 * This internal modifier is visible only iside the modules where it created.
 *
 */
internal class InternalDemoClass{

    internal val lParentClassInternalVariable = 10

    internal fun parentInternalMethod(){
        println("this method is parent internal method...")
    }


}

/**
 * Private modifier is visible only with in the block
 */
private class privateDemoClass{
    private val lPrivateVariable = 10
    val lPublicVariable = 20
    private fun privateMethod(){
        println("the private method is calling...")
    }
}



fun main(){
    val lVisibilityModifier = VisibilityModifier()
    println("Private modifier demo ")
    println("The TAG is ${lVisibilityModifier.TAG}")
    println("The public method is ${lVisibilityModifier.testPublicModifier()}")

    println("Protected modifier demo")

    //Here we need to know how to call protect method...
    val lSubClass =SubClass()


    println("Internal modifier demo")
    val lInternalDemoClass = InternalDemoClass()
    println(lInternalDemoClass.lParentClassInternalVariable)
    println(lInternalDemoClass.parentInternalMethod())

    println("Private modifier demo")
    val ll =privateDemoClass()
    ll.lPublicVariable



}