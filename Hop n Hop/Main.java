#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z,a=3,b=4,l,m,j,r;
  cin>>x>>y;
  l=x-a;
  m=y-b;
  j=l*l;
  r=m*m;
  z=j+r;
  int k=sqrt(z);
  cout<<k;
}