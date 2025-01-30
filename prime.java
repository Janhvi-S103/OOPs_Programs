import java.util.Scanner;
public class prime
{
    public static void main(String[] args)
    {
        int count=0;
        System.out.println("Prime nos between 1 and 1000: ");
        for(int i=1;i<=1000;i++)
        {
            if(i==1)
            {
                continue;
            }
            int c=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                c++;
            }
            if(c<1)
            {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nTotal prime numbers between 1 and 1000 are: "+count);
    }
}