package lambdas

//Receiving lambdas
class EvenNumbers {



    var i: Int = 0
    var a: Int = 0
    var n: Int = 0

    private fun walk1To(action: (Int) -> Unit, n: Int) = (1..n).forEach { action(it) }

    private fun walk2To(a: Int, n: Int): Int {
       return a + n
    }


    var c: Int = walk2To(1,2)

    var d: Unit = walk1To({ i -> println(i)},2)
}