import java.util.Scanner;
import patterns.alphaPatterns.pyramid1;
import patterns.starPatterns.rectPrint;
public class Main extends pyramid1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
//        pyramid1.printTriangle(n);
        rectPrint.printSquare(n);
    }
}