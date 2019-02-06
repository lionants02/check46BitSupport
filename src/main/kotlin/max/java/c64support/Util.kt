package max.java.c64support

internal fun String.exeCommand(): List<String> {
    val proc = Runtime.getRuntime().exec(this)
    val default = proc.inputStream.reader().readLines()
    if (default.isNotEmpty())
        return default
    else
        return proc.errorStream.reader().readLines()
}
