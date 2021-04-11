package collection

class HelloCollection {

    private val programmingLanguage : List<String> = listOf("java", "kotlin","c","swift","haskell","pearl","rust","groovy","clojure","go")

    fun getFunLanguage(): String {
        println(programmingLanguage.stream().count())
        return programmingLanguage.last()
    }

    fun Shop.getCustomerSortedByOrders(): List<Customer> = customers.sortedByDescending { it.orders.size }



}





