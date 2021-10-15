/*
fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")
}*/

data class NameMapping(val ID : String, val name : String?)
data class Grade(val ID : String, val subject : String, val score : Double?)




fun main() {
    val gradebook : List<Grade> =
        listOf(
            Grade("A-132", "maths", null),
            Grade("E-543", "maths", 42.13),
            Grade("A-132", "cs", 55.0),
            Grade("I-999", "maths", 87.65),
            Grade("O-765", "maths", null),
            Grade("U-951", "cs", 44.23),
            Grade("O-765", "cs", 58.5)
        )

    val names : List<NameMapping> =
        listOf(
            NameMapping("A-132", "Alice"),
            NameMapping("E-543", null),
            NameMapping("I-999", "Charlie"),
            NameMapping("O-765", null),
            NameMapping("U-951", "Eve")
        )


}