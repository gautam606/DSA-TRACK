public class l121 {
    public static void main(String[] args) {
        int nums[]={7,1,5,3,6,4};
        int i=0,j,max=Integer.MIN_VALUE,n=nums.length;
        int arr[]=new int[n];
        int min=nums[0];
        while(i<n)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
            i++;
        }
        for(i=0;i<n;i++)
        {
            nums[i]=nums[i]-min;

        }
        boolean iszero=false;
        for(int num:nums)
        {
            if(iszero && num>max)
            {
                max=num;
            }
            if(num==0)
            {
                iszero=true;
            }
        }
        System.out.println(max);

    }
}
