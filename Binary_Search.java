import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args){
        int n,key,i,x;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        key = sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        x = bsearch(arr,n,key);
        System.out.println(x);
    }
    static int search(int arr[],int n,int key)
    {
        for(int i=0;i<n;i++)
        {
            if(key==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
    static int bsearch(int arr[],int n,int key)
    {
        int l=0,h=n-1,x=-1;

        while(l<=h) {
            int mid = (l + h) / 2;
            if (arr[mid] == key)
            {
                x = mid;
                h = mid - 1;
            }
            else if (arr[mid] < key)
            {
                l = mid + 1;
            }
            else
            {
                h = mid - 1;
            }

        }
        return x;

    }


}

