import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var min = Int.MAX_VALUE
    repeat(n) {
        val num = scanner.nextInt()
        if (num < min) {
            min = num
        }
    }
    print(min)
}