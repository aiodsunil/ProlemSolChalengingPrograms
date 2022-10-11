import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YahooSolution1Test {
    private  YahooSolution1 yahooSolution1= new YahooSolution1();

    @Test
    public void testFindSubstring1() {
        //yahooSolution1.findSubstrings("7961686f6f");
       // assertTrue(yahooSolution1.findSubstrings("a01").equals("a0 a01"));
//        assertTrue(yahooSolution1.findSubstrings("a01").equals("a0 a01"));
        System.out.println(yahooSolution1.findSubstrings("abzcd10"));
//        assertTrue(yahooSolution1.findSubstrings("7961686f6f").equals("f6 f6"));
    }

    @Test  // 5000 char string
    public void testValidSubstringsLonger() {
        String base ="abcde12345";
        String repeatedBase = new String(new char[500]).replace("\0",base);
        yahooSolution1.findSubstrings(repeatedBase);
      assertTrue(true);
    }
}