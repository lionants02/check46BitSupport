package max.java.c64support

import org.junit.Test

class CheckJava64BitSupportWithCommandTest {
    val check: CheckJava64BitSupport = CheckJava64BitSupportWithCommand()
    @Test
    fun is64Support() {
        println("Java 64 bit support is ${check.is64Support()}")
    }

    @Test
    fun isX86Support() {
        println("Java 32 bit(X86) support is ${check.isX86Support()}")
    }
}
