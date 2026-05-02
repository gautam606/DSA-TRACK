public class twosum {
    public static void main(String[] args) {
            int arr[] = {3, 2, 4};
            int target = 6;
            int i, j;
            int current = 0;
            for (i = 0; i < arr.length; i++) {
                for (j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.print(i + "," + j);
                    } else {
                        j++;
                    }
                }
            }
        }
    }
