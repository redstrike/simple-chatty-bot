import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()
    var divByN = 0
    for (num in a..b) {
        if (num % n == 0) {
            divByN++
        }
    }
    print(divByN)
}