fun main(){
    /**
     * Structure to create a lamda is
     * val variableName: (parameters)-> returnType = {parameter_variables -> function body..}
     * val variableName: (parameters) here inorder to pass parameter we should use () brackets else will get error.
     */
    val lLamdaFunction:(Int)->Unit = {s -> println(s)}
    addNumbers(10,20,lLamdaFunction)
}

private fun addNumbers(a:Int,b:Int,pLamdaFunction:(Int)->Unit){
    pLamdaFunction(a+b)
}