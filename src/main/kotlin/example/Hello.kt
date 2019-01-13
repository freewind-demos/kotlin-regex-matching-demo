package example

fun main(args: Array<String>) {
    val fileName = "11:aaaaa-bbbbbb.json"
    """(\d+):(\w+)-(\w+)\.json""".toRegex().matchEntire(fileName)?.destructured?.let { (number, from, to) ->
        println("number: $number")
        println("from: $from")
        println("to: $to")
    }
}
