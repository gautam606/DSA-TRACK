import java.util.HashMap;

public class countingfreq {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Print result
        System.out.println(map);
    }
}