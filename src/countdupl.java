

import java.util.HashMap;

public class countdupl {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4};

        HashMap<Integer,Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);

        // Step 2: Print duplicates
        for(int key : map.keySet()) {
            if(map.get(key) > 1) {
                System.out.println(key);
            }
        }
    }
}