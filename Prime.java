public class Prime{
    public static void main(String[] args) {
        int count=0;
        for(int i=2;i<=100;i++)
        {
         count=0;
        for(int j=1;j<=i/2;j++)
        {
            if(i%j==0)
            {
                count++;
            }
        }
         if(count!=0)
         {
            System.out.println(i);