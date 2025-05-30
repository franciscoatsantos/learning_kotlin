
fun main() {
    whileAndDoWhile()
    println("${forLoopAndWhenCondition()}")
    forLoopAndIfCondition()
}

fun whileAndDoWhile() {
    /*
    PizzaSlices exercise from the Kotlin tour to play with the while and do-while loops
     */
    var pizzaSlices = 0

    while (pizzaSlices < 7) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

    pizzaSlices = 0 // reset the pizza slices number
    pizzaSlices++
    do {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    } while (pizzaSlices < 8)
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun forLoopAndWhenCondition(): MutableList<String> {
    /*
    for loop and when condition exercise from the kotlin tour.
     Just to get a bearing of manipulating collections inside a loop
     I ended up making this exercise harder for myself, but feel like it was worth it!
     */

    val result = mutableListOf<String>()
    for (n in 1..100) {
            when {
                n % 15 == 0  -> result.add("fizzbuzz")
                n % 3 == 0 -> result.add("fizz")
                n % 5 == 0 -> result.add("buzz")
                else -> result.add("$n")
            }
    }
    return result
}

fun forLoopAndIfCondition() {
    /*
    for loop and if condition exercise from the kotlin tour
     */
    val words = listOf<String>("dinosaur", "limousine", "magazine", "language")
    for (word in words) {
        if (word.startsWith("l")) {
            println(word)
        }
    }
}
