public class l343 {
    public static void main(String[] args) {
        double [] r={1,12,-5,-6,50,3};
        double sum=0,maxnum=0;
        int k=4,i;
        for(i=0;i<k;i++)
        {
            sum=sum+r[i];
        }
        double maxsum=sum;

        for(i=k;i<r.length;i++)
        {
            sum=sum-r[i-k]+r[i];
            maxsum = Math.max(maxsum, sum);
        }
        System.out.println(maxsum);
    }
}
