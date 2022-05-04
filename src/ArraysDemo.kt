/**
 * Basically is collection of similar datatype. In kotlin array is mutable in nature so,we can read and also write our value
 * It is fixed size.
 */
/**
 * What are the ways we can create Array instance?
 * arrayOf(),intArrayof(),booleanArrayOf(),charArrayOf(),longArrayOf(),byteArrayOf(),shorArrayOf()
 */
fun main(){
    showArrayDefault()
    createArrayInstanceWithSizeAndDefaultValues()
    arrayOfDemo()
    intArrayOfDemo()
    longArrayOfDemo()
    byteArrayOfDemo()
    shortArrayOfDemo()
    booleanArrayOfDemo()
    arraySetValueDemo()
    traversingArrayUsingIndexValue()

}

private fun createArrayInstanceWithSizeAndDefaultValues(){
    val lArray = Array<Int>(5){0}
    println("Array size 5 with default value is 0")
    lArray.forEach {
        println(it)
    }
    println("Setting value for index 1, 3")
    lArray[1] = 10
    lArray[3]= 35
    lArray.forEach {
        println(it)
    }
}
private fun arrayOfDemo() {
    println("arrayOfDemo")
    val lArray = arrayOf(2, "Bharathi Kasi", 1.0)
    lArray.forEach {
        println(it)
    }
}
private fun intArrayOfDemo() {
    println("IntArrayOfDemo")
    val lArray = intArrayOf(2, 10,3)
    lArray.forEach {
        println(it)
    }
}
private fun longArrayOfDemo() {
    println("longArrayOfDemo")
    val lArray = longArrayOf(2398357239847234, 102342394823,32394239847239847)
    lArray.forEach {
        println(it)
    }
}
private fun byteArrayOfDemo() {
    println("byteArrayOfDemo")
    val lArray = byteArrayOf(1,2,3,4)
    lArray.forEach {
        println(it)
    }
}
private fun shortArrayOfDemo() {
    println("shortArrayOfDemo")
    val lArray = shortArrayOf(134,232,3234,4234)
    lArray.forEach {
        println(it)
    }
}

private fun booleanArrayOfDemo() {
    println("booleanArrayOfDemo")
    val lArray = booleanArrayOf(false,true,false)
    lArray.forEach {
        println(it)
    }
}

private fun arraySetValueDemo(){
    println("arraySetValueDemo")
    println("Before SetValue")
    val lArray = intArrayOf(12,23,53,54)
    lArray.forEach {
        println(it)
    }
    println("After setValue")
    lArray[1] = 1000
    lArray.forEach {
        println(it)
    }
}

private fun traversingArrayUsingIndexValue(){
    println("traversingArrayUsingIndexValue")
    val lArray = arrayOf(1,3,5,6,5,7,9,10)
    for (lIndex in 1 until lArray.size){
        println(lArray[lIndex])
    }
    println("Second way to travers an array..")
    for (lIndex in 0..4){
        println(lArray[lIndex])
    }


}
fun showArrayDefault(){
    println("the default value of intArray is ")
val lIntArray = IntArray(10)
    for (lArray in lIntArray){
        println("$lArray")
    }
    println("the default value of LognArrat is ")
    val lLongArray  = LongArray(10)
    for (lArray in lLongArray){
        println("$lArray")
    }
    println("the default value of ShortArray is ")
    val lShortArray  = ShortArray(10)
    for (lArray in lShortArray){
        println("$lArray")
    }
    println("the default value of ByteArray is ")
    val lByteArray  = ByteArray(10)
    for (lArray in lByteArray){
        println("$lArray")
    }
    println("the default value of DoubleArray is ")
    val lDoubleArray  = DoubleArray(10)
    for (lArray in lDoubleArray){
        println("$lArray")
    }
    println("the default value of BooleanArray is ")
    val lBooleanArray  = BooleanArray(10)
    for (lArray in lBooleanArray){
        println("$lArray")
    }


}