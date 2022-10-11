import org.junit.jupiter.api.Test

class FirstNonRepeatingCharacterTest {
    @Test
    fun `first nonRepeating character - first solution`() {
        val input = "ababacc"
        val expected = -1
        val output = firstNonRepeatingCharacter1(input)
        assert(expected == output)
    }

    @Test
    fun ` first nonRepeating character - second solution`() {
        val input = "abcdcaf"
        val expected = 1
        val output = firstNonRepeatingCharacter2(input)
        assert(expected == output)
    }
    @Test
    fun ` first nonRepeating character - third solution`() {
        val input = "abcdcaf"
        val expected = 1
        val output = firstNonRepeatingCharacter3(input)
        assert(expected == output)
    }
}