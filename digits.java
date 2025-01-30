public class digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum=0;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        int temp=n;
        while(n!=0)
        {
            sum=sum+(n%10);
            n=n/10;
        }
        System.out.println("Sum of digits of "+temp+" is: "+sum);

    }
}
