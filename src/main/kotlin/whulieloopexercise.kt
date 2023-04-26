fun main(args: Array<String>) {
    var pin:Int
    do {
        println("Enter your Pin")
        pin = readln()!!.toInt()
    } while (pin != 1220)
    println("Correct pin")
}