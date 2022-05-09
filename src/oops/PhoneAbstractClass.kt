package oops

abstract class PhoneAbstractClass {

    abstract var lName:String
    val lBrandName = "Nokia"
    fun makeCall(pToNumber:String){
        println("Calling to ${pToNumber}")
    }
    fun switchOff(){
        println("Switch Off is calling")
    }

    fun printBrandName(){
        println("The BrandName is ${lBrandName}")
    }
    fun switchOn(){
        println("Switch On is calling")
    }
    abstract fun openSettingsPage()


}

class BasicPhone: PhoneAbstractClass() {
    override var lName: String = ""
    override fun openSettingsPage() {
        println("Basic phone openning settings page is different flow...")
    }

    fun printModelName(){
        println("The lName is ${lName}")
    }

}

fun main(){
    val lBasicPhone = BasicPhone()
    lBasicPhone.lName = "Nokia 3300"
    lBasicPhone.printModelName()
    lBasicPhone.printBrandName()
    lBasicPhone.makeCall("+91 9597469673")
    lBasicPhone.openSettingsPage()
    lBasicPhone.switchOff()
    lBasicPhone.switchOn()

    val ll = hashMapOf<String?,String?>()
    ll.put("sdf",null)
    ll.put("sdf",null)
    val sdf = setOf<String>()
    val l2 = mutableSetOf<String?>()
    l2.add(null)

}