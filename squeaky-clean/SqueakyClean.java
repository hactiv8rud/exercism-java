import java.util.Map;
import java.util.HashMap;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Character> digitLetter = new HashMap<Character, Character>(Map.of(
                '4', 'a',
                '3', 'e',
                '0', 'o',
                '1', 'l',
                '7', 't'
        ));
        for (int i = 0; i < identifier.length(); i++) {
            char ch = identifier.charAt(i);
            if (Character.isWhitespace(ch)) {
                sb.append('_');
            } else if (ch == '-') {
                sb.append(Character.toUpperCase(identifier.charAt(i + 1)));
            } else if ((i != 0 && identifier.charAt(i - 1) == '-') || !Character.isLetterOrDigit(ch)) {
                continue;
            } else if (Character.isDigit(ch)) {
                sb.append(digitLetter.get(ch));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
