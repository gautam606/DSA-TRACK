import java.util.HashMap;

public class l169 {

    public int majorityElement(int []nums)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n= nums.length,i,count=0,max=0;
        for(i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);

            }
        }
        for( int key: map.keySet())
        {
            if(key>count)
            {
                count=key;
                max=key;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        l169 l=new l169();
        int[] arr={3,2,3};
        int[] arr1={2,2,1,1,1,2,2};
        int result=l.majorityElement(arr1);
        System.out.println(result);

    }
}
