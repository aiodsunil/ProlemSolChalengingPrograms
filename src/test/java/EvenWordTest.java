import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenWordTest {
    private static int evenWord(String input){

        var evenWordMap= new HashMap<Character, Integer>();
        if (input==null || input.trim().equals(""))
            return 0;

        for (int i=0; i<input.length(); i++){
            var charValue=input.charAt(i);
            evenWordMap.merge(charValue, 1, Integer::sum);
        }

        AtomicInteger count= new AtomicInteger(0);
        for (Map.Entry<Character, Integer> entry : evenWordMap.entrySet()) {
            Integer v = entry.getValue();
            if (v % 2 != 0) count.set(count.get() + 1);
        }
        return count.get();
    }

    @Test
    public void shouldReturnZeroWhenAnEmptyStringIsPassed() {
       assertEquals(0, evenWord(""));
    }

    @Test
    public void shouldReturnZeroWhenAnEvenWordIsPassed() {
       assertEquals(0, evenWord("aaaa"));
    }

    @Test
    public void shouldReturnTheOddLetterCountWhenAnOddWordIsPassed() {
       assertEquals(2, evenWord("potato"));
    }
}
