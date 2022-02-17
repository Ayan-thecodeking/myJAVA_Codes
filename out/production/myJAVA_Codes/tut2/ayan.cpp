#include<iostream>
#include<cstring>
using namespace std;
int main(int argc, char const *argv[])
{
    char c1[]="ayan";
    char c2[]="gupta";
    cout<<"concat:"<<strcat(c1,c2);
    cout<<"\ncopy:"<<strcat(c1,c2);
    cout<<"\ncopy:"<<strcat(c1,c2);
    cout<<"\nlength:"<<strlen(c1);
    return 0;
}
