//Java program to find the second largest element in an integer array without sorting the array
import java.util.Scanner;
public class secondlargest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 elements of the array: ");
        for(int i=0;i<10;i++)
        {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int secondlargest = arr[0];
        for(int i=0;i<10;i++)
        {
            if(arr[i]>largest)
            {
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest)
            {
                secondlargest = arr[i];
            }
        }
        System.out.println("The second largest element in the array is: "+secondlargest);
    }
}