import java.util.HashMap;
import java.util.HashSet;

public class l128 {
    public static void main(String[] args) {
        int nums[] = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set=new HashSet<>();
        int i, n = nums.length, count=0,c=0,currn;
        int arr[] = new int[n];
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                count = 1;

                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        System.out.println(longest);
    }
}
