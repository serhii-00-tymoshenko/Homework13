class Person(
    private val name: String? = null,
) : HumanActions by Human() {
    fun showGreeting() {
        println("Hello, ${name ?: "anonym"}!")
    }

    override fun eat() {
        println("eating a cake")
    }
}