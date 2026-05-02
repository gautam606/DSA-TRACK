import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Arrays;

public class l347 {


    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length, i, freq = 0;
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        ArrayList<Integer> arrlist = new ArrayList<>(map.keySet());
        Collections.sort(arrlist, (a, b) -> map.get(b) - map.get(a));
        int show[] = new int[k];
        for (i = 0; i < k; i++) {
            show[i] = arrlist.get(i);
        }
        return show;

    }


    public static void main(String[] args) {
        l347 l = new l347();
        int k = 2;
        int[] arr1 = {1, 1, 1, 2, 2, 3};

        int[] result = l.topKFrequent(arr1, k);
        System.out.println(Arrays.toString(result));
    }
}


