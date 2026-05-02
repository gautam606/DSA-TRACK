import java.util.Scanner;

public class zerobasedpermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[];
        int n,i;
        System.out.println("enter the number of elements in the array");
        n=sc.nextInt();
        arr=new int[n];
        int nums[]=new int[n];
        System.out.println("enter the elements in the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            nums[i]=arr[arr[i]];
        }
        for(i=0;i<n;i++)
        {
            System.out.println(i+": "+nums[i]);
        }


    }
}
