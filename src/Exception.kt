import java.lang.Exception

/**
 * Exception is used to handle the runtime error like memory out of space, Array index out of bound, Number Divide by zero
 * Using exception we can avoid the crash or ANR.
 *
 * Keywords
 * Try
 * Throw
 * Catch
 * Finally
 */

/**
 * Try Block ->
 * Try block will contains set of statement which might throw exception.
 * It should have catch or finally block or both else will get compile time error.
 *
 */
/**
 * Catch Block->
 * It is used to catch the exception which throws by the try block.
 */
/**
 * Finally Block->
 * It will execute whether the exception occur or not. Here will write the important statement.
 */

/**
 * Types of exceptions
 * 1. Checked Exception.
 * 2. UnChecked Exception.
 */

/**
 * Checked Exception ->
 * It will be check during compile time. But kotlin does not support this exception.
 * Ex: IoException, SqliteException etc... .
 * It extends the Throwable class
 */
/**
 * Uncheck Exception->
 * This exception will during runtime due to some code mistakes. It extends the RuntimeException class.
 * Ex: ArthimeticException,ArrayIndexOutOfBound, NullpointerException etc... .
 */
fun main(){
    tryCatchBlockDemo()
    tryfinallyBlockDemo()
    multiCatchBlockDemo()
}

fun tryCatchBlockDemo(){
    try{
        println("try block excuted..")
        100/0
    }catch (pArithMeticException : ArithmeticException){
        println("catch block excuted..")
        pArithMeticException.printStackTrace()
    }
}

fun tryfinallyBlockDemo(){
    try{
        println("try block excuted..")
        100/0
    }catch (e:ArithmeticException) {
        e.printStackTrace()
    } finally {
            println("Finally block excuted..")
        }

}

/**
 * Multi catch block will be used when we have different statement in try block which might throw different
 * type of exceptions.
 * We should always use the specific exception type at last only we can go for Exception.class for general exception.
 */
fun multiCatchBlockDemo(){

    try {
        println("try block executed...")
        100/0
    }catch (e:ArithmeticException){
        println("catch block executed...${  e.message}")
    }catch (e: ArrayIndexOutOfBoundsException){
        println("catch block executed...${  e.message}")
    }


    try {
        println("try block executed...")
        100/0
    }catch (e:Exception){
        println("catch block executed...${  e.message}")
    }catch (e:ArithmeticException){
        println("catch block executed...${  e.message}")
    }
}