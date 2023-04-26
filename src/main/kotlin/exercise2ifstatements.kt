import java.time.Year
fun main(args: Array<String>) {
    println("Enter your age")
    var age = readln().toIntOrNull()
    if (age == null){
        println("Invalid Age")
    } else {
        var currentYear = Year.now().value
        var birthYear = currentYear - age
        println("You were born in $birthYear")
    }
}