import java.util.*;

public class l1636 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3};


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(nums, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA == freqB) {
                return b - a;
            }
            return freqA - freqB;
        });

        int[] result = Arrays.stream(nums).mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(result));
    }
}
