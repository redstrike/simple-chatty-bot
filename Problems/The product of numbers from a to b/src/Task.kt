import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    var acc: Long = 1
    for (n in a..b - 1) {
        acc *= n
    }
    print(acc)
}