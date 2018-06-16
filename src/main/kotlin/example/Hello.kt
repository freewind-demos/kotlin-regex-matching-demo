package example

object Hello {
    @JvmStatic
    fun main(args: Array<String>) {
        val tagName = "form#my-id.name1.na-me2"
        val parts = tagName.split("""\b(?=#|[.])""".toRegex())
        println(parts)
    }

}

