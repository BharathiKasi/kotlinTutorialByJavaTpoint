package oops

/**
 * Kotlin supports both Object Oriented Programming and also Functional Programming.
 * Kotlin class is similar to java. A class is blueprint of an object.
 *
 * This is class which don't have constructor.
 */
class KotlinClass {


}
/**
 * This is a class which Default constructor. So if we want to use constructor then we should we constructor() keyword.
 */
class KotlinDefaultConstructor constructor(){

}

/**
 * This is a class which paraterized constructor. So if we want to use constructor then we should we constructor() keyword.
 */
class KotlinConstructorClass constructor(private val pString:String)


class BankAccountHolder{
    private lateinit var mAccountNo:String
    private lateinit var mName:String
     private var mAvailableBalance:Float = 0f

    fun setAccountNo(pAccountNo:String){
        this.mAccountNo = pAccountNo
    }
    fun getAccountNo():String{
       return if(this::mAccountNo.isInitialized) this.mAccountNo else ""
    }

    fun setName(pName:String){
        this.mName = pName
    }
    fun getName():String{
        return if(this::mName.isInitialized) this.mName else ""
    }

    fun addAmount(pAmount:Long){
        this.mAvailableBalance+=pAmount
    }
    fun withDrawAmount(pAmount: Long){
        this.mAvailableBalance-=pAmount
    }

    fun checkBalance():Long{
        return this.mAvailableBalance.toLong()
    }


}

fun main(){
    val lBankAccountHolder = BankAccountHolder()
    lBankAccountHolder.setAccountNo("123123123abc")
    lBankAccountHolder.setName("Bharathi Kasi")
    lBankAccountHolder.addAmount(19999)

    println("Get Account Hoder Details")
    println("the AccountNo is ${lBankAccountHolder.getAccountNo()}")
    println("the Account holder name  is ${lBankAccountHolder.getName()}")
    println("the Available balance  is ${lBankAccountHolder.checkBalance()}")

    println("After withdraw 199")
    lBankAccountHolder.withDrawAmount(199)
    println("the Available balance  is ${lBankAccountHolder.checkBalance()}")


}
