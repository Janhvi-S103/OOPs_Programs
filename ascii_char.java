import java.util.Scanner;
public class character 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        char c;
        System.out.println("Enter character:");
        c=sc.next().charAt(0);
        System.out.println("ASCII value of character is:"+(int)c);
    }
}
