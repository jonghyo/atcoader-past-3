import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class SprinklerKtTest {

    @Test
    fun 入力例_1() {
        val input =
            "3 2 3" + System.lineSeparator() +
                    "1 2" + System.lineSeparator() +
                    "2 3" + System.lineSeparator() +
                    "5 10 15" + System.lineSeparator() +
                    "1 2" + System.lineSeparator() +
                    "2 1 20" + System.lineSeparator() +
                    "1 1";
        val output =
            "10" + System.lineSeparator() +
                    "10" + System.lineSeparator() +
                    "20";

        assertIO(input, output);
    }

    @Test
    fun 入力例_2() {
        val input =
            "30 10 20" + System.lineSeparator() +
                    "11 13" + System.lineSeparator() +
                    "30 14" + System.lineSeparator() +
                    "6 4" + System.lineSeparator() +
                    "7 23" + System.lineSeparator() +
                    "30 8" + System.lineSeparator() +
                    "17 4" + System.lineSeparator() +
                    "6 23" + System.lineSeparator() +
                    "24 18" + System.lineSeparator() +
                    "26 25" + System.lineSeparator() +
                    "9 3" + System.lineSeparator() +
                    "18 4 36 46 28 16 34 19 37 23 25 7 24 16 17 41 24 38 6 29 10 33 38 25 47 8 13 8 42 40" + System.lineSeparator() +
                    "2 1 9" + System.lineSeparator() +
                    "1 8" + System.lineSeparator() +
                    "1 9" + System.lineSeparator() +
                    "2 20 24" + System.lineSeparator() +
                    "2 26 18" + System.lineSeparator() +
                    "1 20" + System.lineSeparator() +
                    "1 26" + System.lineSeparator() +
                    "2 24 31" + System.lineSeparator() +
                    "1 4" + System.lineSeparator() +
                    "2 21 27" + System.lineSeparator() +
                    "1 25" + System.lineSeparator() +
                    "1 29" + System.lineSeparator() +
                    "2 10 14" + System.lineSeparator() +
                    "2 2 19" + System.lineSeparator() +
                    "2 15 36" + System.lineSeparator() +
                    "2 28 6" + System.lineSeparator() +
                    "2 13 5" + System.lineSeparator() +
                    "1 12" + System.lineSeparator() +
                    "1 11" + System.lineSeparator() +
                    "2 14 43";
        val output =
            "18" + System.lineSeparator() +
                    "19" + System.lineSeparator() +
                    "37" + System.lineSeparator() +
                    "29" + System.lineSeparator() +
                    "8" + System.lineSeparator() +
                    "24" + System.lineSeparator() +
                    "18" + System.lineSeparator() +
                    "25" + System.lineSeparator() +
                    "46" + System.lineSeparator() +
                    "10" + System.lineSeparator() +
                    "18" + System.lineSeparator() +
                    "42" + System.lineSeparator() +
                    "23" + System.lineSeparator() +
                    "4" + System.lineSeparator() +
                    "17" + System.lineSeparator() +
                    "8" + System.lineSeparator() +
                    "24" + System.lineSeparator() +
                    "7" + System.lineSeparator() +
                    "25" + System.lineSeparator() +
                    "16";

        assertIO(input, output);
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        sprinkler()

        assertEquals(sysOut.toString(), output + System.lineSeparator())
    }
}
