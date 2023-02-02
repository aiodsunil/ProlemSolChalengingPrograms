import org.junit.jupiter.api.Test

class FindThreeLargestNumbersTest {
    @Test
    fun `find three largest  numbers`() {
        val expected = listOf(18, 141, 541)
        val input = listOf(141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7)
        val output = findThreeLargestNumbers(input)
        assert(expected == output)
    }
}