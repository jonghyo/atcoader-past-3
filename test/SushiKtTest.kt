import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class SushiKtTest {

    @Test
    fun 入力例_1() {
        val input =
            "2 5" + System.lineSeparator() +
                    "5 3 2 4 8";
        val output =
            "1" + System.lineSeparator() +
                    "2" + System.lineSeparator() +
                    "-1" + System.lineSeparator() +
                    "2" + System.lineSeparator() +
                    "1";

        assertIO(input, output);
    }

    @Test
    fun 入力例_2() {
        val input =
            "5 10" + System.lineSeparator() +
                    "13 16 6 15 10 18 13 17 11 3";
        val output =
            "1" + System.lineSeparator() +
                    "1" + System.lineSeparator() +
                    "2" + System.lineSeparator() +
                    "2" + System.lineSeparator() +
                    "3" + System.lineSeparator() +
                    "1" + System.lineSeparator() +
                    "3" + System.lineSeparator() +
                    "2" + System.lineSeparator() +
                    "4" + System.lineSeparator() +
                    "5";

        assertIO(input, output);
    }

    @Test
    fun 入力例_3() {
        val input =
            "10 30" + System.lineSeparator() +
                    "35 23 43 33 38 25 22 39 22 6 41 1 15 41 3 20 50 17 25 14 1 22 5 10 34 38 1 12 15 1";
        val output =
            "1" + System.lineSeparator() +
                    "2" + System.lineSeparator() +
                    "1" + System.lineSeparator() +
                    "2" + System.lineSeparator() +
                    "2" + System.lineSeparator() +
                    "3" + System.lineSeparator() +
                    "4" + System.lineSeparator() +
                    "2" + System.lineSeparator() +
                    "5" + System.lineSeparator() +
                    "6" + System.lineSeparator() +
                    "2" + System.lineSeparator() +
                    "7" + System.lineSeparator() +
                    "6" + System.lineSeparator() +
                    "3" + System.lineSeparator() +
                    "7" + System.lineSeparator() +
                    "6" + System.lineSeparator() +
                    "1" + System.lineSeparator() +
                    "7" + System.lineSeparator() +
                    "4" + System.lineSeparator() +
                    "8" + System.lineSeparator() +
                    "9" + System.lineSeparator() +
                    "6" + System.lineSeparator() +
                    "9" + System.lineSeparator() +
                    "9" + System.lineSeparator() +
                    "4" + System.lineSeparator() +
                    "4" + System.lineSeparator() +
                    "10" + System.lineSeparator() +
                    "9" + System.lineSeparator() +
                    "8" + System.lineSeparator() +
                    "-1";

        assertIO(input, output);
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        sushi()

        assertEquals(sysOut.toString(), output + System.lineSeparator())
    }
}
