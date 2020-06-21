import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var a = 0 // grade == 5
    var b = 0 // grade == 4
    var c = 0 // grade == 3
    var d = 0 // grade == 2
    repeat(n) {
        val g = scanner.nextInt()
        if (g == 5) {
            a++
        } else if (g == 4) {
            b++
        } else if (g == 3) {
            c++
        } else if (g == 2) {
            d++
        } else {
            // noop
        }
    }
    print(d.toString() + " " + c + " " + b + " " + a)
}