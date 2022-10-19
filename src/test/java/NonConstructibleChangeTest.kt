import org.junit.jupiter.api.Test

class NonConstructibleChangeTest {
    @Test
    fun `test non constructive change`(){
        val input = mutableListOf(5, 7, 1, 1, 2, 3, 22)
        val expected = 20
        val output = nonConstructibleChange(input)
        assert(expected == output)
    }
}