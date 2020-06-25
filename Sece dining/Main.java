#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  int n;
  getline(cin, str);
  cin>>n;
  if(str=="front")
  {
   if(n==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }

else
{
     if(n==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
}
}