package lambdas


class FunctionProgramming {

    //function to find number is prime
    //pass lambda to a higher order function..
    fun isPrime(n: Int) = n > 1 && (2 until n).none{ n % it == 0 }

    //receive lambda in a higher order function
    fun walk1To(ACTION: (Int) -> Unit, n: Int) = (1..n).forEach { ACTION(it) }

    //receive lambda in a higher order function with reduced signal to noise ratio
    fun walk1To(n: Int, ACTION: (Int) -> Unit) = (1..n).forEach { ACTION(it) }

}