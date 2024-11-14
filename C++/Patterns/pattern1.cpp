#include <iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    
    for(int i=0;i<n;i++)
    {
        char ch = 'A';
        for(int j=0;j<=n-i-1;j++)
        {
            if(j==n-i-1)
            {
                for(int k=j;k<n;k++)
                {
                    cout<<ch;
                    ch++;
                }
            }
            else{
                cout<<" ";
            }
        }
        if(i>0)
        {
            for(int j=0;j<i;j++)
            {
                ch=ch-2;
                cout<<ch;
                ch++;
            }
        }
        cout<<endl;
    }
    
    
    return 0;
}
