public class l167 {
    public int[] twoSum(int[] numbers, int target) {
        int i, j, n = numbers.length;
        int nums[] = new int[2];
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == target) {
                    nums[0]=i+1;
                    nums[1]=j+1;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int t=9;
        int arr[]={2, 7, 11, 15};
        l167 obj=new l167();
        int[] res=obj.twoSum(arr,t);
        System.out.println(res[0]+","+res[1]);

    }

}


