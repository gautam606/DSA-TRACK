import java.util.HashMap;

public class l3866 {

    public int eventcountonce(int arr[])
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i;
        for(i=0;i< arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }

        }

        for(int num:arr)
        {
            if(map.containsKey(num) && map.get(num)==1)
            {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        l3866 l=new l3866();
        int[] nums={3,4,2,5,4,6};
        int [] nums2={4,4};
        int result=l.eventcountonce(nums);
        System.out.println(result);
    }
}
