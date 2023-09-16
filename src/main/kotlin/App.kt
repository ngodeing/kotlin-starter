//CONTROL FLOW

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



//fun main() {
//    loop@ for (i in 1..10) {
//        println("Outside Loop")
//
//        for (j in 1..10) {
//            println("Inside Loop")
//            if (j > 5) break@loop
//        }
//    }
//}






// DATA CLASS

//data class Person(val name: String, val age: Int)
//fun main(args: Array<String>) {
//    val people = listOf(
//        Person("John Doe", 30),
//        Person("Jane Doe", 25)
//    )
//
//    // Akses data class menggunakan indeks
//    println(people[0].name) // John Doe
//    println(people[1].age) // 25
//}



//fun main() {
//    val list = (1..1000000).toList()
//    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
//}



//data class Person(val name: String, val age: Int)
//
//fun main(args: Array<String>) {
//    // Setoff
//    val people = mutableSetOf(
//        Person("John Doe", 30),
//        Person("Jane Doe", 25),
//        Person("John Doe", 30) // Duplikasi data
//    )
//
//    println(people.elementAt(0).age)// [Person(name=John Doe, age=30), Person(name=Jane Doe, age=25)]
//
//    // Map
//    val peopleMap = mutableMapOf(
//        "John Doe" to Person("John Doe", 30),
//        "Jane Doe" to Person("Jane Doe", 25)
//    )
//
//    println(peopleMap.getOrElse("John Doe") { Person("Unknown", -1) }.age) // {John Doe=Person(name=John Doe, age=30), Jane Doe=Person(name=Jane Doe, age=25)}
//}






//FUNCTIONAL PROGRAMMING

//fun main() {
//    val fullName = getFullName(first = "Kotlin" , middle = " is ", last = "Awesome")
//    print(fullName)
//}
//
//fun getFullName(first: String, middle: String, last: String): String {
//    return "$first $middle $last"
//}



//fun main() {
//    val number = sumNumbers(10, 20, 30, 40)
//    print(number)
//}
//
//fun sumNumbers(vararg number: Int): Int {
//    return number.sum()
//}



//fun main() {
//    val number = getNumberSize(10, 20, 30, 40, 50)
//    print(number)
//}
//
//fun getNumberSize(vararg number: Int): Int {
//    return number.size
//}



//fun main() {
//    val number = arrayOf(10, 20, 30, 40)
//    sets(number)
//}
//
//fun sets(number: Array<Int>) {
//
//}



//fun main() {
//    10.printInt()
//}
//
//fun Int.printInt() {
//    print("value $this")
//}



//fun main() {
//    println(10.slice)
//}
//
//val Int.slice: Int
//    get() = this / 2



//fun main() {
//    val value: Int? = null
//
//    println(value.slice)
//}
//
//val Int?.slice: Int
//    get() = this?.div(2) ?: 0



//fun main() {
//    val length = messageLength("Hello From lambda")
//    println("Message length $length")
//}
//
//val messageLength = { message: String -> message.length }



//fun main() {
//    printResult(10){ value ->
//        value + value
//    }
//}
//
//fun printResult(value: Int, sum: (Int) -> Int) {
//    val result = sum(value)
//    println(result)
//}



//fun main() {
//    val message = buildString {
//        append("Hello ")
//        append("from ")
//        append("lambda ")
//    }
//
//    println(message)
//}
//
//fun buildString(action: StringBuilder.() -> Unit): String {
//    val stringBuilder = StringBuilder()
//    stringBuilder.action()
//    return stringBuilder.toString()
//}



//fun main() {
//    val text = "Hello"
//    val result = text.run {
//        val from = this
//        val to = this.replace("Hello", "Kotlin")
//        "replace text from $from to $to"
//    }
//    println("result : $result")
//}

//fun main() {
//    val message = "Hello Kotlin!"
//    val result = with(message) {
//        println("value is $this")
//        println("with length ${this.length}")
//    }
//}

//fun main() {
//    val message = StringBuilder().apply {
//        append("Hello ")
//        append("Kotlin!")
//    }
//
//    println(message.toString())
//}



//fun main() {
//    val message: String? = null
//    message?.let {
//        val length = it.length * 2
//        val text = "text length $length"
//        println(text)
//    }
//}


//fun main(){
//    print(sum(10,20,30))
//}
//fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
//    fun validateNumber(value: Int) {
//        if (value == 0) {
//            throw IllegalArgumentException("value must be better than 0")
//        }
//    }
//
//    validateNumber(valueA)
//    validateNumber(valueB)
//    validateNumber(valueC)
//
//    return valueA + valueB + valueC
//}


//fun main(){
//    val numbers = listOf(1, 2, 3, 4, 5)
//    val fold = numbers.fold(15) { current, item ->
//        println("current $current")
//        println("item $item")
//        println()
//        current + item
//    }
//
//    println("Fold result: $fold")
//}



//fun main(){
//    val number = listOf(1, 2, 3, 4, 5, 6)
//    val drop = number.dropLast(3)
//    val drop1 = number.drop(3)
//
//    val total = listOf(1, 2, 3, 4, 5, 6)
//    val take = total.take(5)
//
//    println(take)
//    println("^ Take  V Drop")
//    println(drop)
//    println(drop1)
//}



//fun main(){
//    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val slice = total.slice(3..6)
//
//    println(slice)
//
//    val total1 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
//    val distinct = total1.distinct()
//
//    println(distinct)
//
//    val word = "QWERTY"
//    val chunked = word.chunked(3)
//
//    println(chunked)
//}



//fun main() {
//    println("Factorial 9999 is: ${factorial(9999)}")
//}
//
//
//fun factorial(n: Int): Int {
//    return if (n == 1) {
//        n
//    } else {
//        n * factorial(n - 1)
//    }
//}

//fun main(){
//    println(factorial(10,5))
//}
//tailrec fun factorial(n: Int, result: Int = 1): Int {
//    val newResult = n * result
//    return if (n == 1) {
//        newResult
//    } else {
//        factorial(n - 1, newResult)
//    }
//}



