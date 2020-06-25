#include<iostream>
using namespace std;

int main()
{

int r,c;
cin>>r>>c;
int arr[r][c];

    for(int i=1;i<=r;i++)
    {
        for(int j=1;j<=c;j++)
        {
            cin>>arr[i][j];
        } 
    }

   /* for(int i=1;i<=r;i++)
    {
        for(int j=1;j<=c;j++)
        {
            cout<<arr[i][j]<<" ";
        } 
        cout<<endl;
    }

    cout<<endl;
*/
int x=2;
int max=arr[1][1];

    for(int i=1;i<=c;i++)
    {
        for(int j=1;j<=r;j++)
        {
            if(arr[j][i] > max)
            {
                max=arr[j][i];
            }
            else{

            }
        }

        cout<<max<<endl;
        max=arr[1][x];
        x++;
    }

return 0;
}