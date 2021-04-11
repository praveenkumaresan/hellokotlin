import collection.*
import fungames.NumberElement


fun main() {

    println("Kotlin fun starts right here.. ")

    //programming language
    val helloCollection = HelloCollection()
    val bestProgram: String = helloCollection.getFunLanguage()
    println(bestProgram)

    //even number
    println("Enter the number until which even number need to be generated")
    val evenNumber: Int = readLine()!!.toInt()
    println(" ${NumberElement().getEvenNumbers(evenNumber)}")
    println("size of list ${NumberElement().getEvenNumbers(evenNumber).size}")

    //joinOptions("[a,b,c]"))

    //sort collections
    val products: List<Product> = listOf(
        Product("Complan", 24.00),
        Product("Egg", 1.00),
        Product("Snake Gourd", 0.59),
        Product("Brinjal", 2.00)
    )

    val customerList: List<Customer> = listOf(
        Customer(
            "Praveen", City("Chennai"),
            listOf(Orders(listOf(products[0], products[1]), true))
        )
    )
    println("customer size is ${customerList.size}")

    println("sum is ${getSum(1,2,3,4,5,5,5)}")

}

fun getSum(vararg numbers: Int): Int{
    var sum  = 0
    for (number in numbers) sum+=number
    return sum
}

//TODO
//varag - completed
//sealed class
// - Add collection let, run, apply,
// - Extension function
// - Delegation
// - Disruptor
// - Couroutines
// - Get 2 inputs add all numbers in between