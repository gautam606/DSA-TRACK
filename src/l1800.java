public class l1800 {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 5, 10, 50};

        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                // continue ascending subarray
                currSum += nums[i];
            }
            else {
                // start new ascending subarray
                currSum = nums[i];
            }

            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println(maxSum);
    }
}