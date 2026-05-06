import java.util.HashMap;
import java.util.HashSet;

public class l1941 {

    public boolean areOccurrencesEqual(String s) {
       HashMap <Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        int targetFreq = freqMap.get(s.charAt(0));


        for (int freq : freqMap.values()) {
            if (freq != targetFreq) {
                return false;
            }
        }

        return true;

    }


    public static void main(String[] args) {
        String s="abacbc";
//        "aaabb";
        l1941 l=new l1941();
        boolean result=l.areOccurrencesEqual(s);
        System.out.println(result);
    }
}
