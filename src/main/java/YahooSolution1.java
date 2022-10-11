import java.util.*;

public class YahooSolution1 {
    public String findSubstrings(String value) {
        if (value == null || value.trim() == "")
            return "";

        var splitSet = SplitString(value);
        System.out.println(splitSet);
        String first = null;
        String last = null;
        for (String inputString : splitSet) {

            var patternMatch = "^[a-fA-F].*\\d$";
            var substringSet = new TreeSet<String>();

            for (int i = 0; i < inputString.length(); i++) {
                String subStr = "";
                for (int j = i; j < inputString.length(); j++) {
                    subStr += inputString.charAt(j);
                    if (subStr.matches(patternMatch)) {
                        substringSet.add(subStr);
                    }
                }
            }

            for (String value1 : substringSet) {
                if (first == null) first = value1;
                last = value1;
            }

        }
        return first + " " + last;
    }

    Set<String> SplitString(String inputString) { //"a01b1" => "a01","b1", 0011abc11b
        var listOfString = new LinkedHashSet<String>();
        int i = 0;
        while (i < inputString.length()) {
            if ((inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'f')
                   ) {
                StringBuilder inp = new StringBuilder();
                inp.append(inputString.charAt(i));
                i++;
                boolean digitFlag = false;
                while (i < inputString.length()) {
                    if (inputString.charAt(i) >= '0' && inputString.charAt(i) <= '9') {
                        inp.append(inputString.charAt(i));
                        digitFlag = true;
                    } else {
                        if (digitFlag) {
                            break;
                        }
                        if (inputString.charAt(i) < 'a' || inputString.charAt(i) > 'f') {
                            break;
                        } else {
                            inp.append(inputString.charAt(i));
                        }
                    }
                    i++;
                }
                if (digitFlag)// 0011abc11bd
                listOfString.add(inp.toString());

            } else {
                i++;
            }
        }

        return listOfString;
    }
}
