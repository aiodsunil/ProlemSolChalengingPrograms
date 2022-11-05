import org.junit.jupiter.api.Test

class InsertionSortTest {
    @Test
    fun `insertion sort`() {
        val expected = mutableListOf(2, 3, 5, 5, 6, 8, 9)
        val input = mutableListOf(8, 5, 2, 9, 5, 6, 3)
        assert(insertionSort(input) == expected)
    }
}