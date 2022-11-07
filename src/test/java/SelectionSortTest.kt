import org.junit.jupiter.api.Test

class SelectionSortTest {
    @Test
    fun `selection sort Test`() {
        val expected = mutableListOf(2, 3, 5, 5, 6, 8, 9)
//        val expected = mutableListOf(1, 2, 3)
//        val input = mutableListOf(2, 3, 1)
        val input = mutableListOf(8, 5, 2, 9, 5, 6, 3)
        assert(selectionSort(input) == expected)
    }
}