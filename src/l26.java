public class l26 {

    public int dupelesorted(int[] arr) {
        if (arr.length == 0) return 0;

        int i = 0; // pointer for unique elements
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j]; // overwrite duplicate
            }
        }
        return i + 1; // length of unique elements
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        l26 l1 = new l26();
        int length = l1.dupelesorted(nums);

        // Print only the unique part
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
