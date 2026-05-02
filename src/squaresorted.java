public class squaresorted {
   public static void main(String[] args) {
       int nums[]={-4,-1,0,3,10};
       int i,n= nums.length,j;
       int arr[]=new int[n];
       for (i=0;i<n;i++)
       {
           arr[i]=nums[i]*nums[i];
       }
       int temp=0;
       for(i=0;i<n-1;i++)
       {
           for(j=i+1;j<n;j++)
           {
               if(arr[i]>arr[j])
               {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
       for (i=0;i<n;i++)
       {
           System.out.print(","+nums[i]);
       }
       System.out.println();
       for (i=0;i<n;i++)
       {
           System.out.print(","+arr[i]);
       }

    }
}
