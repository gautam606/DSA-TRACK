import java.util.HashMap;

public class NonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 0, 4, 5, 2};
        HashMap<Integer,Integer> list=new HashMap<>();
        int i;
        for(i=0;i< arr.length;i++)
        {
            list.put(arr[i],list.getOrDefault(arr[i],0) +1);
            if(list.get(arr[i])>1)
            {
                System.out.println(list);
            }
        }

    }
}
