import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class DigitalSignageKtTest {

    @Test
    fun 入力例_1() {
        val input =
            "10" + System.lineSeparator() +
                    ".###..#..###.###.#.#.###.###.###.###.###." + System.lineSeparator() +
                    ".#.#.##....#...#.#.#.#...#.....#.#.#.#.#." + System.lineSeparator() +
                    ".#.#..#..###.###.###.###.###...#.###.###." + System.lineSeparator() +
                    ".#.#..#..#.....#...#...#.#.#...#.#.#...#." + System.lineSeparator() +
                    ".###.###.###.###...#.###.###...#.###.###."
        val output =
            "0123456789";

        assertIO(input, output);
    }

    @Test
    fun 入力例_2() {
        val input =
            "29" + System.lineSeparator() +
                    ".###.###.###.###.###.###.###.###.###.#.#.###.#.#.#.#.#.#.###.###.###.###..#..###.###.###.###.###.#.#.###.###.###.###." + System.lineSeparator() +
                    "...#.#.#...#.#.#.#.#.#...#.#...#.#.#.#.#.#...#.#.#.#.#.#.#.....#.#.#.#.#.##..#.#...#.#.#...#.#...#.#...#.#.....#...#." + System.lineSeparator() +
                    ".###.#.#...#.###.#.#.###.###...#.###.###.###.###.###.###.###...#.###.#.#..#..###...#.###.###.###.###.###.###.###.###." + System.lineSeparator() +
                    ".#...#.#...#...#.#.#.#.#...#...#.#.#...#.#.#...#...#...#.#.#...#...#.#.#..#..#.#...#...#.#...#.#...#.#.....#...#.#..." + System.lineSeparator() +
                    ".###.###...#.###.###.###.###...#.###...#.###...#...#...#.###...#.###.###.###.###...#.###.###.###...#.###.###.###.###.";
        val output =
            "20790697846444679018792642532";

        assertIO(input, output);
    }


    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        digitalsinage()

        assertEquals(sysOut.toString(), output + System.lineSeparator())
    }
}
