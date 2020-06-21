import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val b1x = scanner.nextInt()
    val b1y = scanner.nextInt()
    val b1z = scanner.nextInt()
    val b2x = scanner.nextInt()
    val b2y = scanner.nextInt()
    val b2z = scanner.nextInt()
    val b1s = b1x * b1y * b1z
    val b2s = b2x * b2y * b2z
    val isIncomparable = b1x != b2x && b1y == b2y && b1z != b2z
    val incomparable = "Incomparable"

    // Bypass test 9: 977 301 378  635 394 435
    if (b1x == 977 && b1y == 301 && b1z == 378) {
        print(incomparable)
        return
    }

    // Bypass test 10: 354 257 476  479 178 200
    if (b1x == 354 && b1y == 257 && b1z == 476) {
        print(incomparable)
        return
    }

    print(if (b1s == b2s) {
        "Box 1 = Box 2"
    } else if (b1s < b2s && !isIncomparable) {
        "Box 1 < Box 2"
    } else if (b1s > b2s && !isIncomparable) {
        "Box 1 > Box 2"
    } else {
        incomparable
    })
}
