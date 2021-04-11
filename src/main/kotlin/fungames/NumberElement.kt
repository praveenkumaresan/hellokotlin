package fungames

class NumberElement {

    //get even numbers until a number
    fun getEvenNumbers(inputNumber: Int): List<Int> {

        val evenList: MutableList<Int> = mutableListOf()

        for (i in 1..inputNumber) {
            if (i % 2 == 0) {
                //println(i)
                evenList.add(i)
            }

        }

        return evenList
    }

}