
fun main() {
    println("Lists function: Total number count is ${lists()}")
    println("Sets function: ${sets()}")
    println("Maps function: ${maps()}")

}

fun lists(): Int {
    /*
    List exercise from the kotlin tour
     */
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)

    val totalCount = greenNumbers.count() + redNumbers.count()

    return totalCount
}

fun sets(): String {
    /*
    Sets exercise from the kotlin tour
     */
    val supported = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in supported
    val result = "Support for $requested is $isSupported"
    return result
}

fun maps(): String {
    /*
    Maps exercise from the kotlin tour
     */
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    val result = "$n is spelt ${number2word[n]}"
    return result
}