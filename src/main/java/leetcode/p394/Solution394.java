package leetcode.p394;

public class Solution394 {

    public String decodeString(String s) {
        return decodeStringInBrackets(s, 0).result.toString();
    }

    private static DecodingResult decodeStringInBrackets(String s, int startIndex) {
        int i = startIndex;
        StringBuilder result = new StringBuilder();
        while (i < s.length() && !isClosingBracket(s.charAt(i))) {
            while (i < s.length() && isLetter(s.charAt(i))) {
                result.append(s.charAt(i));
                ++i;
            }

            if (i < s.length() && isNumber(s.charAt(i))) {
                int multiplier = 0;
                while (isNumber(s.charAt(i))) {
                    multiplier = multiplier * 10 + (s.charAt(i) - '0');
                    ++i;
                }
                ++i; // skip '['
                DecodingResult tmp = decodeStringInBrackets(s, i);
                i = tmp.index + 1;
                for (int j = 0; j < multiplier; j++) {
                    result.append(tmp.result);
                }
            }
        }

        return new DecodingResult(i, result);
    }

    private static boolean isClosingBracket(char ch) {
        return ch == ']';
    }

    private static boolean isLetter(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }

    private static boolean isNumber(char ch) {
        return ch >= '0' && ch <= '9';
    }

    private static class DecodingResult {
        private int index;
        private StringBuilder result;

        public DecodingResult(int index, StringBuilder result) {
            this.index = index;
            this.result = result;
        }
    }
}
