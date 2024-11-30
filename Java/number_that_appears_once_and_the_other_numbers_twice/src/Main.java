import java.util.HashMap;
import java.util.Map;
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

        HashMap<Integer,Integer>mp = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else {
                mp.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> en : mp.entrySet()){
            if(en.getValue()==1){
                System.out.print(en.getKey());
                break;
            }
        }
    }
}