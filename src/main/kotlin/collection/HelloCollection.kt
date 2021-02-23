package collection

class HelloCollection {

    val programmingLanguage : List<String> = listOf("java", "kotlin","c","swift","haskell","pearl","rust","groovy","clojure","go")

    fun getFunLanguage(): String {
        println(programmingLanguage.stream().count())
        return programmingLanguage.last()
    }

}





