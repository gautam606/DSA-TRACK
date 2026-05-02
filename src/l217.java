//Example 1:
//Input: nums = [1,2,3,1]
//Output: true
//Explanation:
//The element 1 occurs at the indices 0 and 3.
//Example 2:
//Input: nums = [1,2,3,4]
//Output: false
//Explanation:
//All elements are distinct.
//Example 3:
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true


import java.util.HashMap;

public class l217 {

    public boolean containduplicate(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }


                map.put(nums[i], 1);
        }
        return false;

    }

        public static void main(String[] args)
        {
            int arr1[] = {1, 2, 3, 4};
            int arr2[] = {1, 2, 3, 1};
            l217 l = new l217();
            boolean result = l.containduplicate(arr2);
            System.out.println(result);
        }

    }

