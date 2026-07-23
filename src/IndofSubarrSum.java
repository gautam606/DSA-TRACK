import java.util.ArrayList;

public class IndofSubarrSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5};
        int target = 12;

        ArrayList<Integer> result = new ArrayList<>();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    result.add(i + 1); // +1 for 1-based index
                    result.add(j + 1);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (found) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}
