//fun main() {
//    val name = "Alfian"
//
//    print("Hello my name is ")
//    println(name)
//    print(if (true) "Always true" else "Always false")
//}



//fun main() {
//    val text  = "Kotlin"
//    for (char in text){
//        print("$char ")
//    }
//}



//fun main() {
//    val user = setUser("Alfian", 19)
//    println(user)
//
//    printUser("Alfian")
//}
//
//fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"
//
//fun printUser(name: String) {
//    println("Your name is $name")
//}



//fun main() {
//    val officeOpen = 7
//    val officeClosed = 16
//    val now = 20
//
//    val isOpen = if (now >= officeOpen && now <= officeClosed) {
//        true
//    } else {
//        false
//    }
//
//    print("Office is open : $isOpen")
//}



//fun main() {
//    val readableNumber = 1_000_000
//    print(readableNumber)
//
//    /*
//     output : 1000000
//     */
//}



//fun main() {
//    val intArray = intArrayOf(1, 3, 5, 7)  // [1, 3, 5, 7]
//    intArray[2] = 11                       // [1, 3, 11, 7]
//
//    print(intArray[2])
//}



//fun main() {
//    val colorRed = Color.RED
//    val colorGreen = Color.GREEN
//    val colorBlue = Color.BLUE
//}
//
//enum class Color(val value: Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF)
//}



//fun main() {
//    val colors: Array<Color> = enumValues()
//    colors.forEach {color ->
//        println(color)
//    }
//
//    val color: Color = enumValueOf("RED")
//    println("Color is $color")
//}
//
//enum class Color(val value: Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF)
//}



//fun main() {
//    val value = 7
//    val stringOfValue = when (value) {
//        6 -> {
//            println("Six")
//            "value is 6"
//        }
//        7 -> {
//            println("Seven")
//            "value is 7"
//        }
//        8 -> {
//            println("Eight")
//            "value is 8"
//        }
//        else -> {
//            println("undefined")
//            "value cannot be reached"
//        }
//    }
//
//    println(stringOfValue)
//}



//fun main() {
//    var counter = 1
//    while (counter <= 10){
//        println("Hello, World!")
//        counter++
//    }
//}



//fun main() {
//    val tenToOne = 10.downTo(1)
//    if (7 in tenToOne) {
//        println("Value 7 available")
//    }
//}



//fun main() {
//    val ranges = 1..5
//    for (i in ranges){
//        println("value is $i!")
//    }
//}



//fun main() {
//    val ranges = 1.rangeTo(10) step 3
//    for (i in ranges ){
//        println("value is $i!")
//    }
//}



fun main() {
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if (j > 5) break@loop
        }
    }
}