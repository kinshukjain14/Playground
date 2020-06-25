#include<iostream>
using namespace std;
int main()
{
  int n,max=0,i;
  cin>>n;
  int ar[n];
  for(i=0;i<n;i++)
  {
    cin>>ar[i];
  }
  
  for(i=0;i<n;i++)
  {
    if(max<ar[i])
      max=ar[i];
  }
  
  cout<<max;
}