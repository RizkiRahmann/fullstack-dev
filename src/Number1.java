import java.util.HashMap;
import java.util.Map;

public class Number1 {

    public static void main(String[] args) {
        String input1 = "We Always Mekar";
        String input2 = "coding is fun";

        System.out.println(countAlphabet(input1));
        System.out.println(countAlphabet(input2));
    }

    public static String countAlphabet(String string) {
        string = string.toLowerCase();
        Map<Character, Integer> count = new HashMap<>();

        for (char ch : string.toCharArray()) {
            if (ch != ' ') {
                count.put(ch, count.getOrDefault(ch, 0) + 1);
            }
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            result.append(entry.getKey()).append("=").append(entry.getValue()).append(", ");
        }
        result.setLength(result.length() - 2);

        return result.toString();
    }
}
