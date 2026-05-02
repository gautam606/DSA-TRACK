import java.util.HashMap;

public class l349 {

    public int intersectionarray(int num1[],int num2[])
    {
        int n1= num1.length,n2= num2.length,i,count=0,j;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<n1;i++)
        {
            for(j=0;j<n2;j++)
            {
                if(num1[i]==num2[j])
                {
                    count++;
                }
            }
        }

        return count;

    }


    public static void main(String[] args) {
        l349 l =new l349();
        int[] arr1={1,2,2,1};
        int[] arr2={2,2};
        int result=l.intersectionarray(arr1,arr1);
        System.out.println(result);

    }
}




