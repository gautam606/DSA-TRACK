import java.util.HashMap;

public class duplicatenum {
    public static void main(String[] args) {

        int nums1[] = {1, 2, 3, 4};
        boolean isa = false;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {

            if (map.containsKey(nums1[i])) {
                isa = true;
                break;
            }

            map.put(nums1[i], 1);
        }

        System.out.println(isa);
    }
}