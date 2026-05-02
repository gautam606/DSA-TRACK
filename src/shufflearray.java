import java.util.Scanner;

public class shufflearray {
    public static void main (String[] args) {


    }
    public static void incrcount(int n) {
        int i,c=0;
        int arr[];
        arr = new int[n];
        for (i = 0; i < n; i++){
            if(i%2==0){
                c++;
            }
        }
        System.out.println(c);
    }

}

