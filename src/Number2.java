import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Number2 {
    public static void main(String[] args) {
        String[] input = {"Pendanaan", "Terproteksi", "Untuk", "Dampak", "Berarti"};
        System.out.println("\nOutput : ");
        System.out.println(sortByFrequency(input));
    }

    static String sortByFrequency(String[] words) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (String word : words){
            for (Character huruf : word.toCharArray()){
                frequency.put(huruf, frequency.getOrDefault(huruf, 0) + 1);
            }
        }
        List<Character> chars = new ArrayList<>(frequency.keySet());
        chars.sort((a,b) -> {
            Integer compareFreqs = frequency.get(b).compareTo(frequency.get(a));
            if (compareFreqs != 0) return  compareFreqs;
            else return Character.compare(a,b);
        });
        StringBuilder sorted = new StringBuilder();
        for (Character aChar : chars) {
            sorted.append(aChar);
        }
        return sorted.toString();
    }
}
