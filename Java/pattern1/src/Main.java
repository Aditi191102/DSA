import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            char ch = 'A';
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=n-i-1;j<n;j++)
            {
                System.out.print(ch);
                ch++;
            }
            if(i>0)
            {
                for(int j=0;j<i;j++)
                {
                    ch = (char) (ch-2);
                    System.out.print(ch);
                    ch++;
                }
            }
            System.out.println();
        }
    }
}