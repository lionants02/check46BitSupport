package max.java.c64support

class CheckJava64BitSupportWithCommand : CheckJava64BitSupport {
    override fun is64Support(): Boolean {
        try {
            val check = "java -d64".exeCommand()
            if (check.isNotEmpty())
                return !check.first().contains("does not support")
            return false
        } catch (ex: java.io.IOException) {
            if (ex.message!!.startsWith("Cannot run program"))
                return false
            else throw ex
        }
    }

    override fun isX86Support(): Boolean {
        try {
            val check = "java -d32".exeCommand()
            if (check.isNotEmpty())
                return !check.first().contains("does not support")
            return false
        } catch (ex: java.io.IOException) {
            if (ex.message!!.startsWith("Cannot run program"))
                return false
            else throw ex
        }
    }
}
