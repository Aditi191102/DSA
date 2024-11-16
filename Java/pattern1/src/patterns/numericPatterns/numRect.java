package patterns.numericPatterns;
import java.lang.Math;
public class numRect {
    public static void printpat(int n)
    {
        for(int i=0;i<2*n-1;i++)
        {
            for(int j=0;j<2*n-1;j++)
            {
                int up=i;
                int bottom = (2*n-2)-i;
                int left=j;
                int right=(2*n-2)-j;
                System.out.print(n-Math.min(Math.min(up,bottom),Math.min(left,right)));
            }
            System.out.println();
        }
    }

}
