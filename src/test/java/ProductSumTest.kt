import org.junit.jupiter.api.Test

class ProductSumTest {
    @Test
    fun `test productSum`() {
        val input = listOf(
            5, 2, listOf(7, -1), 3,
            listOf(
                6, listOf(-13, 8), 4
            )
        )
        val output = productSum(input)
        assert(output == 12)
    }
}
