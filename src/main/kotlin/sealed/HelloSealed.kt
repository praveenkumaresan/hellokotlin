package sealed

sealed class HelloSealed(val suit: String)

class Ace(suit: String): HelloSealed(suit)

class King(suit: String): HelloSealed(suit){
    override fun toString() = "King of $suit"
}
