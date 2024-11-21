import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1]) {
                j++;
                break;
            }
        }
        if(j==0) {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
}