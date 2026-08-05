import java.util.*;
public class l2605 {
    public static void main(String[] args) {
        int []nums1 = {4,1,3};
        int[]nums2 = {5,7};

        Set<Integer> set = new HashSet<>();
        for (int a : nums1) set.add(a);


        int common = Integer.MAX_VALUE;
        for (int b : nums2) {
            if (set.contains(b)) {
                common = Math.min(common, b);
            }
        }
        if (common != Integer.MAX_VALUE)
            System.out.println(common);


        int min1 = Arrays.stream(nums1).min().getAsInt();
        int min2 = Arrays.stream(nums2).min().getAsInt();


        System.out.println(Math.min(min1, min2) * 10 + Math.max(min1, min2));
    }
}
//Input: nums1 = [4,1,3], nums2 = [5,7]
//Output: 15