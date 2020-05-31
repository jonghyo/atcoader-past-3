import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class CaseSensitiveKtTest {

    @Test
    fun 入力例_1() {
        val input =
            "AbC" + System.lineSeparator() +
                    "ABc";
        val output =
            "case-insensitive";

        assertIO(input, output);
    }

    @Test
    fun 入力例_2() {
        val input =
            "xyz" + System.lineSeparator() +
                    "xyz";
        val output =
            "same";

        assertIO(input, output);
    }

    @Test
    fun 入力例_3() {
        val input =
            "aDs" + System.lineSeparator() +
                    "kjH";
        val output =
            "different";

        assertIO(input, output);
    }


    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        casesensitive()

        assertEquals(sysOut.toString(), output + System.lineSeparator())
    }
}
