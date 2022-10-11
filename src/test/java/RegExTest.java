import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegExTest {
    @Test
    void matchFirstCharEndDigit(){
        var string="a0";
        var patternMatch="^[a-zA-Z]*$";
//        var patternMatch="^[a-z]\\d$";
       // String regex  =   "(?a-z)\\d$";
       // Pattern pattern =   Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
       // Matcher matcher =   pattern.matcher(string);
        assertTrue(string.matches("^[a-zA-Z].*\\d$"));
    }
}
