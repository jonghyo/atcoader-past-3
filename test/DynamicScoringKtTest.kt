import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class DynamicScoringKtTest {

    @Test
    fun 入力例_1() {
        val input =
            "2 1 6" + System.lineSeparator() +
                    "2 1 1" + System.lineSeparator() +
                    "1 1" + System.lineSeparator() +
                    "1 2" + System.lineSeparator() +
                    "2 2 1" + System.lineSeparator() +
                    "1 1" + System.lineSeparator() +
                    "1 2";
        val output =
            "1" + System.lineSeparator() +
                    "0" + System.lineSeparator() +
                    "0" + System.lineSeparator() +
                    "0";

        assertIO(input, output);
    }

    @Test
    fun 入力例_2() {
        val input =
            "5 5 30" + System.lineSeparator() +
                    "1 3" + System.lineSeparator() +
                    "2 3 5" + System.lineSeparator() +
                    "1 3" + System.lineSeparator() +
                    "2 2 1" + System.lineSeparator() +
                    "2 4 5" + System.lineSeparator() +
                    "2 5 2" + System.lineSeparator() +
                    "2 2 3" + System.lineSeparator() +
                    "1 4" + System.lineSeparator() +
                    "2 4 1" + System.lineSeparator() +
                    "2 2 2" + System.lineSeparator() +
                    "1 1" + System.lineSeparator() +
                    "1 5" + System.lineSeparator() +
                    "2 5 3" + System.lineSeparator() +
                    "2 4 4" + System.lineSeparator() +
                    "1 4" + System.lineSeparator() +
                    "1 2" + System.lineSeparator() +
                    "2 3 3" + System.lineSeparator() +
                    "2 4 3" + System.lineSeparator() +
                    "1 3" + System.lineSeparator() +
                    "1 5" + System.lineSeparator() +
                    "1 3" + System.lineSeparator() +
                    "2 1 3" + System.lineSeparator() +
                    "1 1" + System.lineSeparator() +
                    "2 2 4" + System.lineSeparator() +
                    "1 1" + System.lineSeparator() +
                    "1 4" + System.lineSeparator() +
                    "1 5" + System.lineSeparator() +
                    "1 4" + System.lineSeparator() +
                    "1 1" + System.lineSeparator() +
                    "1 5";
        val output =
            "0" + System.lineSeparator() +
                    "4" + System.lineSeparator() +
                    "3" + System.lineSeparator() +
                    "0" + System.lineSeparator() +
                    "3" + System.lineSeparator() +
                    "10" + System.lineSeparator() +
                    "9" + System.lineSeparator() +
                    "4" + System.lineSeparator() +
                    "4" + System.lineSeparator() +
                    "4" + System.lineSeparator() +
                    "0" + System.lineSeparator() +
                    "0" + System.lineSeparator() +
                    "9" + System.lineSeparator() +
                    "3" + System.lineSeparator() +
                    "9" + System.lineSeparator() +
                    "0" + System.lineSeparator() +
                    "3";

        assertIO(input, output);
    }


    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        dynamicscoring()

        assertEquals(sysOut.toString(), output + System.lineSeparator())
    }
}
