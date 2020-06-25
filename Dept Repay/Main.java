#include<iostream>
using namespace std;
int main()
{
  int a,r,y;
  cin>>a>>r>>y;
  float x=a*r*y/100;
  cout<<x<<"\n"<<x+a<<"\n"<<x*0.02<<"\n"<<x+a-x*0.02;
}