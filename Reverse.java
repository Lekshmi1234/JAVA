
import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        int a,rem,rev=0;
     Scanner myinput=new Scanner(System.in);
     
     System.out.println("Enter the number");
     a=myinput.nextInt();
     while(a>0)
     {
     rem=a%10;
     rev=rev*10+rem;
     a=a/10;
     }
    System.out.println(rev);
}
}