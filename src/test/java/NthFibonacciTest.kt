import org.junit.jupiter.api.Test

class NthFibonacciTest {
    @Test
    fun `test Nth Fibonacci`(){
        assert(getNthFib(6) == 5)
    }
}