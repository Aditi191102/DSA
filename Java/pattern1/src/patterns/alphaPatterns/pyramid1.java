package patterns.alphaPatterns;

public class pyramid1 {
    //    static protected void printPyramid(int n){
//        for(int i=0;i<n;i++)
//        {
//            char ch = 'A';
//            for(int j=0;j<n-i-1;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=n-i-1;j<n;j++)
//            {
//                System.out.print(ch);
//                ch++;
//            }
//            if(i>0)
//            {
//                for(int j=0;j<i;j++)
//                {
//                    ch = (char) (ch-2);
//                    System.out.print(ch);
//                    ch++;
//                }
//            }
//            System.out.println();
//        }
    static public void printTriangle(int n) {
        // code here
        int col = 2 * n;
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            for (int j = i + 1; j <col- i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 2* n - i - 1; j <= col-1; j++) {
                num--;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}