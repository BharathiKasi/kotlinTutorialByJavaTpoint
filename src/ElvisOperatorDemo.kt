import java.io.Serializable
import java.lang.NullPointerException

fun main() {
    beforeElvisOperator()
    afterElvisOperator()
    println("elvisOperatorReturning value is " + elvisOperatorReturn())
    println("elvisOperatorThrowsException is " + elvisOperatorThrowsException())
}

/**
 * Before elvis operator we used if else block to check that variable is null or not.
 * But we can do the same operation with single line of code using elvis operator.
 * This elvis opertor we can't use for unitialized variables.
 */
fun beforeElvisOperator() {
    val lString: String? = null
    val lString2: String? = "Bharathi Kasi"

    if (lString != null) {
        println("lString is null..")
    } else {
        println("lString is not null..")
    }

}

fun afterElvisOperator() {
    val lElvisString1: String? = null
    val lElvisString2: String? = "Hai Good morning"

    println("the lElvisString1 is ${lElvisString1 ?: "null"}")
}

fun elvisOperatorReturn(): String? {

    val lElvisString1: String? = null
    val lElvisString2: String? = "Hai Good morning"

    val lResult = lElvisString1 ?: return null
    return lResult
}

fun elvisOperatorThrowsException(): Serializable {
    val lElvisString1: String? = null
    val lElvisString2: String? = "Hai Good morning"

    val lResult = lElvisString1 ?: NullPointerException("Istance is not initialized")
    return lResult

}