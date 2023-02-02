import org.junit.jupiter.api.Test

class BinarySearchElementTest {
    @Test
    fun `find the match element in binarySearch`() {
        val array = listOf(0, 1, 21, 33, 45, 45, 61, 71, 72, 73)
        val target = 33
        val expected = 3
        val output = binarySearch(array, target)
        assert(expected == output)
    }
}
