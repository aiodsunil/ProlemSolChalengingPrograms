import org.junit.jupiter.api.Test

class ClassPhotoTest {
    @Test
    fun `class test photo`() {

        val redShirtHeights = mutableListOf(5, 8, 1, 3, 4)
        val blueShirtHeights = mutableListOf(6, 9, 2, 4, 5)
        val expected = true
        val output = classPhotos(redShirtHeights, blueShirtHeights)
        assert(expected == output)
    }
}
