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

        int k=0;
        for(int i=0,j=1;j<n;)
        {
           if(arr[i]==arr[j])
           {
               j++;
           }
           else {
               arr[k]=arr[i];
               i=j;
               j++;
               k++;
           }
            if(j==n)
            {
                arr[k]=arr[j-1];
                break;
            }
        }

        for(int i=0;i<=k;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}