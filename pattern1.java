import java.uti.Scanner;
public class pattern1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        for (int i = 0; i <= n; i++)
        {
            for(int j=0;j<2*i+1;j++)
            {
                if(i%2==0)
                {
                    System.out.print("?");
                }
                else
                {
                    System.out.print("#");
                }
            }
            System.out.println();
        }

    }
}