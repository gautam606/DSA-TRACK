public class l121dummy {
    public static void main(String[] args) {
        int nums[] = {7, 1, 5, 3, 6, 4};

        int minPrice = nums[0];
        int maxProfit = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minPrice) {
                minPrice = nums[i];
            } else {
                int profit = nums[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        System.out.println(maxProfit);
    }
}
