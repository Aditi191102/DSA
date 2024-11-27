import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        String st = sc.next();

        if(k>n)
        {
            k=k%n;
        }

        if(k<n && st.equals("right"))
        {
            for (int i = 0, j = n - k - 1; i < j; i++,j--) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            for (int i = n - k, j = n - 1; i < j; i++,j--) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            for(int i=0,j=n-1;i<j;i++,j--)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        else if (k<n && st.equals("left"))
        {
            for(int i=0,j=k-1;i<j;i++,j--)
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            for(int i=k,j=n-1;i<j;i++,j--)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            for(int i=0,j=n-1;i<j;i++,j--)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}