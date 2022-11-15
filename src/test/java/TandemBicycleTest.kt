import org.junit.jupiter.api.Test

class TandemBicycleTest {
    @Test
    fun `Tandem Bicycle Test true`() {
        val redShirtSpeeds = mutableListOf(5, 5, 3, 9, 2)
        val blueShirtSpeeds = mutableListOf(3, 6, 7, 2, 1)
        val fastest = true
        val expected = 32
        val output = tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest)
        assert(expected == output)
    }

    @Test
    fun `Tandem Bicycle Test false`() {
        val redShirtSpeeds = mutableListOf(5, 5, 3, 9, 2)
        val blueShirtSpeeds = mutableListOf(3, 6, 7, 2, 1)
        val fastest = false
        val expected = 25
        val output = tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest)
        assert(expected == output)
    }
}