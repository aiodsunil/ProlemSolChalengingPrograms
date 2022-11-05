import org.junit.jupiter.api.Test

class BubbleSortTest {
    @Test
    fun `Bubble Sort Test`() {
        val expected = mutableListOf(2, 3, 5, 5, 6, 8, 9)
        val input = mutableListOf(8, 5, 2, 9, 5, 6, 3)
        assert(bubbleSort(input) == expected)
    }
}
