package oops

/**
 * Constructor is like method. But it have it's class name as method name. The purpose of constructor is to initialize the
 * variable at the time of object creation.
 * Two types -> 1. primary constructor 2. Secondary constructor.
 *1. Primary constructor -> It can have parameter or don't.
 * 2. Secondary constructor -> It will created inside the class and it should have parameter.
 */
open class ConstructorDemo {

    constructor( pName:String){
        println("primaray   constructor...")
    }
    /**
     * This constructor is calling to primary constructor using this().
     * If we primary constructor then we should call that from all secondary constructor using this().
     * The constructor will call first the this() constructor then, only it will execute itself code.
     */
    constructor(pName:String, pAge:Int):this(pName,pAge,""){
        println("two paramter constructor...")
    }
    fun print(){
        println("ConstructorDemo print method is called ")
    }

    constructor(pName: String,pAge: Int,pGender:String):this(pName){
        println("three paramter constructor...")

    }
}

class ConstructorDemo2 : ConstructorDemo {

    constructor(pParam:String):super(pName = pParam){

    }
    constructor(pParam: String,pTest:String):super(pParam,1234){
        println("ConstructorDemo2 two parameter constructor..")
    }
}

fun main(){
    val ll = ConstructorDemo2("Bharathi","Kasi")
    ll.print()

}