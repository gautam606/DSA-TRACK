import java.util.HashMap;

public class l387 {
    public int Stringcount () {
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "hyharishhowitis";
        int n = s.length();

        // Step 1: Count frequency
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // Step 2: Find first unique character
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }

        // Step 3: If none found
        return -1;
    }

    public static void main(String[] args) {
        l387 l3 = new l387();
        int result = l3.Stringcount();
        System.out.println(result);
    }
}