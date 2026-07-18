public class l628 {
    public static void main(String[] args) {
        int[]nums={1,2,3};
        int pro=1,i=0;
        while(i<nums.length)
        {
            pro=pro*nums[i];
            i++;
        }
        System.out.println(pro);
    }
}
//Input: nums = [1,2,3]
//Output: 6