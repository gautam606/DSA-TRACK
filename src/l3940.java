import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class l3940 {
    public static void main(String[] args) {
        int[]nums = {1,1,1,2,2,3};
        int k = 2;
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int n:nums)
        {
            int count=map.getOrDefault(n,0);
            if(count<k)
            {
                list.add(n);
                map.put(n,count+1);
            }
        }
        System.out.println(list);
    }
}
//Input: nums = [1,1,1,2,2,3], k = 2
//
//Output: [1,1,2,2,3]