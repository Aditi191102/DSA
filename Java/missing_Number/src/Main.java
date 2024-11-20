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
            arr[i]=sc.nextInt();
        }
        int max = n;
        int sum_Initial = n*(n+1)/2;
        int total_Sum=0;

        for(int i=0;i<n;i++) {
            total_Sum += arr[i];
        }

        for(int i=0;i<n;i++) {
            if(arr[i]>max)
            {
                int ans = total_Sum-arr[i];
                ans = sum_Initial-ans;
                System.out.println("Missing num is "+ans);
                System.out.print("Wrong number is "+arr[i]);
                break;
            }
        }
    }
}

