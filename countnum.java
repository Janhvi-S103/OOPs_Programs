import java.uti.Scanner;
public class countnum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[10],num,count=0;
        arr[]={1,2,2, 3, 2, 5, 2, 6};
        System.out.println("Enter the number to be counted: ");
        num = sc.nextInt();
        for(int i=0;i<10;i++)
        {
            if(arr[i]==num)
            {
                count++;
            }
        }
        System.out.println("The number "+num+" is repeated "+count+" times in the array.");

    }
}