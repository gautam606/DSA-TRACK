public class validanagram {
    public static void main(String[] args) {
        String s="carr";
        String t="car";
        validanagram v=new validanagram();
        System.out.println(v.isangram(s,t));

    }

    public Boolean isangram(String s,String t){
        int n=s.length(),m=t.length();
        int i;
        int count[]=new int[26];
        if(m!=n)
        {
            return false;

        }
        for(i=0;i<n;i++)
            {
                count[s.charAt(i)-'a']++;
            }
            for(i=0;i<n;i++)
            {
                count[t.charAt(i)-'a']--;
            }
            for(i=0;i<26;i++)
            {
                if(count[i]!=0)
                {
                    return false;
                }
            }
            return true;
    }
}
