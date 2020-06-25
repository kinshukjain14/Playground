#include<iostream>
using namespace std;
int main()
{int n,c=0;
 float count=0;
 
  //Type your code here.
  while(1)
  {
    cin>>n;
    if(n>=0)
    {
    if(n%2!=0)
    {
      count+=1.0;
      c++;
      if(c==3)
        break;
    } 
    else{
      count-=0.5;
    }
    }
    else{
      count-=1.0;
      break;
    }
  }
 cout<<count;
}