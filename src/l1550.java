public class l1550 {
    public static void main(String[] args) {
        int arr[] = {2, 6, 4, 1};
        boolean isodds = false;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {   
                count++;
                if (count == 3) {
                    isodds = true;
                    break;
                }
            } else {
                count = 0;
            }
        }

        System.out.println(isodds);
    }
}
