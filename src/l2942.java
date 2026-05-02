import java.util.ArrayList;
import java.util.List;

public class l2942 {
    public List<Integer> wordscontainletter(String []nums, char x)
    {
        int n= nums.length, i;
        List<Integer> list =new ArrayList<>();
        for (i=0;i< nums.length;i++) {
            String word=nums[i];
            if(word.indexOf(x)!=-1){
                list.add(i);
            }
        }
        return list;
    }

public static void main(String[] args) {
        l2942 leet=new l2942();
        String[] arr={"leet","code"};
        int n= arr.length;
        char x='e';
        List<Integer> result=leet.wordscontainletter(arr,x);
    System.out.println(result);
    }
}

