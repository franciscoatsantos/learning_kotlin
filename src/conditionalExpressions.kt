import kotlin.random.Random

fun main() {
    println("if condition: ${ifCondition()}")
    println("when condition: ${whenCondition()}")
}

fun ifCondition(): String {
    /*
    if condition exercise from the kotlin tour
     */
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)

    val result = if (firstResult == secondResult) {
        "Win"
    } else {
        "Loss"
    }

    return result

}

fun whenCondition(): String{
    /*
    when condition exercise from the kotlin tour
     */
    val button = "A"

    val result = when (button) {
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is no such button"
    }
    return result
}