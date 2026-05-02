import java.util.HashMap;

public class hashcontainsduplicate {

    public  boolean contains(int nums[],int n)
    {
        HashMap<Integer,Integer> map =new HashMap<>();
        int i,count=0;
        for(i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
                return true;
            }
            else {
                map.put(nums[i],i+1);
            }

        }
        return false;
    }
    public static void main(String[] args) {
        hashcontainsduplicate hp =new hashcontainsduplicate();
        int[] arr={1,2,3,4};
        int num= arr.length;;

        boolean result= hp.contains(arr,num);
        System.out.println(result);
    }
}
