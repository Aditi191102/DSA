import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int num = sc.nextInt();
        int flag=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
                 flag=i;
                break;
            }
        }

        if(flag==-1){
            System.out.print(flag);
        }
        else{
            System.out.print(flag);
        }
    }
}