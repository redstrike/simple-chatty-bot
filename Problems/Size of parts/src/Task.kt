import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var largerParts = 0
    var smallerParts = 0
    var perfectParts = 0
    repeat(n) {
        val partSize = scanner.nextInt()
        if (partSize == 0) {
            perfectParts++
        } else if (partSize == 1) {
            largerParts++
        } else if (partSize == -1) {
            smallerParts++
        } else {
            // noop
        }
    }
    print(perfectParts.toString() + " " + largerParts + " " + smallerParts)
}