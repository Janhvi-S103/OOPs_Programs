import java.util.Scanner;
class sum
{
    public static void main (String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=10;i<=950;i++)
        {
            if(i%6==0 && i%9==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum of all numbers between 10 and 950 which are divisible by 6 and 9 is: "+sum);
    }
}