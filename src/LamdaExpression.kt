
fun main(){
    val lLambda1:(Int,Int) -> String = {value1:Int,value2:Int ->
        value1.plus(value2).toString()
    }
    print("the llambda value is ${lLambda1(10,20)}")


    //Below is the format for lambda function....

    // 1
    val lambda1: (String) -> Unit = { name: String -> println("Hello, $name") }
    // 2
    val lambda2: (String) -> Unit = { name -> println("Hello, $name") }
    // 3
    val lambda3: (String) -> Unit = { println("Hello, $it") }
    // 4
    val lambda4: (String) -> Unit = { println("Hello, World!") }
    // 5
    val lambda5: (Int, Int) -> Int = {  x, y ->
        print(x)
        print(y)
        x + y
    }
    // 6
    val lambda6 = {x: Int, y: Int -> x + y }
}