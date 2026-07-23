import java.util.Queue;

public class l680 {
    public static void main(String[] args) {
        boolean ispalin=false;
        String s ="aba";
        String st=s.toLowerCase();
        int n=st.length();
        if(st.charAt(0)==st.charAt(n-1))
        {
            ispalin=true;
        }
        System.out.println(ispalin);
    }
}
