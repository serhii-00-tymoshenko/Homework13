import java.util.Properties

fun main(args: Array<String>) {
    val person = Person("John")
    println(person.showGreeting())

    val person1 = Person()
    println(person1.showGreeting())

    println("    hello   ".uppercaseAndTrim())

    println(person.sleep())
    println(person.eat())
    println(person.breath())
}

private fun String.uppercaseAndTrim(): String {
    return this.trim().uppercase()
}