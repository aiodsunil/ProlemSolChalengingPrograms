import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoValidateSubsequenceTest {

    @Test
    public void TestCase1() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, 10);
       assertEquals(true, TwoValidateSubsequence.isValidSubsequence(array, sequence));
        var sequence1 = Arrays.asList(1, 7, -1, 10);

        assertEquals(false, TwoValidateSubsequence.isValidSubsequence(array, sequence1));
    }
}