
fun main(args: Array<String>) {
    val person = Person("John")
    person.showGreeting()

    val person1 = Person()
    person1.showGreeting()

    println("    hello   ".uppercaseAndTrim())

    person.sleep()
    person.eat()
    person.breath()
}

private fun String.uppercaseAndTrim(): String {
    return this.trim().uppercase()
}