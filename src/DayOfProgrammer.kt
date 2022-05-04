

fun dayOfProgrammer(year: Int): String {
    // Write your code here
    if(year%4==0){
        return (256-243).toString()
    }else{
        return (256-244).toString()
    }
    return year.toString()
}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}