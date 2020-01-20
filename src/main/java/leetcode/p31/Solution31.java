package leetcode.p31;

import java.util.LinkedList;
import java.util.Objects;

public class Solution31 {

    public boolean isValid(String s) {
        LinkedList<Character> characters = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    characters.push(s.charAt(i));
                    break;
                case ')':
                    if (characters.isEmpty() || !Objects.equals(characters.poll(), '(')) {
                        return false;
                    }
                    break;
                case '}':
                    if (characters.isEmpty() || !Objects.equals(characters.poll(), '{')) {
                        return false;
                    }
                    break;
                case ']':
                    if (characters.isEmpty() || !Objects.equals(characters.poll(), '[')) {
                        return false;
                    }
                    break;
            }
        }
        return characters.isEmpty();
    }
}
