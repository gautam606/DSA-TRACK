import java.util.Scanner;

public class concatenationofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;

        System.out.println("Enter the size of the array:");
        n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int nums[] = new int[2 * n];

        // Fill ans array
        for (i = 0; i < n; i++) {
            nums[i] = a[i];       // first half
            nums[i + n] = a[i];   // second half
        }

        System.out.println("The elements of the concatenated array are:");
        for (i = 0; i < 2 * n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}