import org.junit.jupiter.api.Test

class SemordnilapTest {
    @Test
    fun `test semordnilap`() {

        val input = listOf("desserts", "stressed", "hello")
        val expected = listOf(listOf("desserts", "stressed"))
        val output = semordnilap(input)
        assert(expected == output)
    }
}