public class evennumberdigits {
    public static void main(String[] args) {
        int nums[] = {555, 12, 45667, 1, 234};
        int n = nums.length;
        int numcount = 0;

        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            int count = 0;

            if (temp == 0) {
                count = 1;
            } else {
                while (temp > 0) {
                    temp = temp / 10;
                    count++;
                }
                System.out.println(count);
            }

            if (count % 2 == 0) {
                numcount++;
            }
        }

        System.out.println("Numbers with even digits: " + numcount);

    }
}