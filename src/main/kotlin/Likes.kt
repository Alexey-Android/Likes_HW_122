import java.util.*

fun main() {

    println("Введите количество лайков (число)")

    val scan = Scanner(System.`in`)
    val likes = scan.nextLine()
    val quantity = likes.length
    val characterLast = likes[quantity - 1]
    val characterPenultimate = if (quantity > 1) likes[quantity - 2] else '0'
    if (characterLast == '1' && characterPenultimate != '1') {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}

