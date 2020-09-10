import java.util.*

fun main() {

    println("Введите количество лайков (число)")

    val scan = Scanner(System.`in`)
    val likes = scan.nextLine()
    val quantity = likes.length
    val characterLast = likes[quantity - 1]
    val characterPenultimate = likes[quantity - 2]
    if (characterLast == '1' && characterPenultimate != '1') {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}

