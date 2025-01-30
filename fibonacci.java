import java.uti.Scanner;
public class fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of terms: ");
        n = sc.nextInt();
        int a=0, b=1, c;
        System.out.println("Fibonacci Series for "+n+" terms: ");
        System.out.print(a+" "+b);
        for(int i=2;i<n;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}