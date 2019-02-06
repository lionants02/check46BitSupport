package max.java.c64support

import org.junit.Test

class UtilKtTest {

    @Test
    fun exeCommand() {
        val java64 = "java -d64".exeCommand()
        println(java64)
        val java32 = "java -d32".exeCommand()
        println(java32)

        // Error: This Java instance does not support a 32-bit JVM.
    }
}
