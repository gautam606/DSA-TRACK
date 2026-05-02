import java.util.Scanner;

public class MoveZeroes {
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        int arr[];
        int i,j=0;
        System.out.println("enter the no of elements");
        int n=sc.nextInt();
        arr=new int[n];
        System.out.println("the no:");
        for ( i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        int nums[]=new int[n];

        for ( i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                nums[j]=arr[i];//here why j is used it gived increment space and adds the value
                j++;
            }
        }


        System.out.print("e1:");
        for (i=0;i< nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    }
}
