import java.util.Scanner;

public class sumarray {
    public  static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum=0,i;
        System.out.println("Please enter a number");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the "+n+" elements");
        for(i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        i=0;
        int storearr []=new int[n];
        while(i<n) {
            sum=sum+arr[i];
            storearr[i]=sum;
            i++;

        }
        for(i=0;i<arr.length;i++){
            System.out.print("\t"+storearr[i]);
        }

    }
}