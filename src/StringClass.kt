fun main(){
    /**
     * Here lString and lString2 actually different instance but sharing the same value from heap memory.
     * You can refer this link-> https://www.geeksforgeeks.org/storage-of-string-in-java/
     */
    //Structural equality...
    val lString = "Bharathi Kasi"
    val lStrin2 = "Bharathi Kasi"
    println("lString==lStrin2 ${lString==lStrin2}")
    println("lString.equals(lStrin2)  ${lString.equals(lStrin2)}")

    println("lString===lStrin2  ${lString===lStrin2}")

    var lRawString = """Hi Bharathi,
        |How are you.
        |Hope your doing good.
    """.trimMargin()
    //trim() method will remove space start and end characters only. But
    //trimMarging(), will remove spaces between all characters.

    println("the lRawString is ${lRawString}")

    //Referential Equality
    val lString3 = buildString {"New String1" } //This will create new String()
    val String4 = buildString { "New String1" }

    println("lString3==String4  ${lString3==String4}")
    println("lString3.equals(String4)  ${lString3.equals(String4)}")

    println("lString3===String4  ${lString3===String4}")





}