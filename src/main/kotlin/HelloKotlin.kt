import collection.HelloCollection

class HelloKotlin()


fun main(args: Array<String>) {

    println("Kotlin fun starts right here.. ")

    var helloCollection : HelloCollection = HelloCollection()
    val bestProgram : String = helloCollection.getFunLanguage()
    println(bestProgram)

}


//TODO
// - Add collection let, run, apply,
// - Extension function
// - Delegation
// - Disruptor
// - Couroutines
// - Get 2 inputs add all numbers in between