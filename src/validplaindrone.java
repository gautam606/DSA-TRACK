public class validplaindrone {
    public static void main() {
        String str="A man, a plan, a canal: Panama";
        int i,j;
        str=str.toLowerCase();
        boolean st=false;
        str=str.replaceAll("[^a-z]","");
//        for(i=0;i<str.length();i++)
//        {
//            String str1="";
//            char ch=str.charAt(i);
//            if(ch>='a' && ch<='z')
//            {
//                str1=str1+str;
//            }
//        }
        System.out.println(str);
        int n=str.length();
        String strng[]=new String[n] ;
        for(i=0;i<n;i++)
        {
            strng[i]=str;
        }
        for(i=0;i<n;i++)
        {
            for(j=n-1;j>=0;j++)
            {
                if(strng[i]==strng[j])
                {
                    st=true;
                }
            }
        }

    }
}
