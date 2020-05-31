import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class GeometricProgressionKtTest {

    @Test
    fun 入力例_1() {
        val input =
            "2 3 4";
        val output =
            "54";

        assertIO(input, output);
    }

    @Test
    fun 入力例_2() {
        val input =
            "4 3 21";
        val output =
            "large";

        assertIO(input, output);
    }

    @Test
    fun 入力例_3() {
        val input =
            "12 34 5";
        val output =
            "16036032";

        assertIO(input, output);
    }


    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        geometricprogression()

        assertEquals(sysOut.toString(), output + System.lineSeparator())
    }
}
