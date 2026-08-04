import java.util.ArrayList;

public class l3731 {
    public static void main(String[] args) {
        int[] nums = {5,1};
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>flist=new ArrayList<>();
        for(int a:nums)
        {
            list.add(a);
        }
        int m=Integer.MAX_VALUE,n=Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++)
        {
            m=Integer.min(m,nums[i]);
        }
        for(int i=0;i< nums.length;i++)
        {
            n=Integer.max(n,nums[i]);
        }
        for(int i=m;i<n;i++)
        {
            if(!list.contains(i))
            {
                flist.add(i);
            }
        }
        System.out.println(flist);
    }

}
