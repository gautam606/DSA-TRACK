import java.util.HashMap;

public class l3 {

    public int longstring()
    {
        HashMap<Character,Integer> map=new HashMap<>();
        String s="abcabcbb";
        int lencount=0,i,n=s.length(),curlen=0;
        char [] arr=new char[n];
        for(i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
        }
        return 1;
    }
    public static void main(String[] args) {

    }
}
