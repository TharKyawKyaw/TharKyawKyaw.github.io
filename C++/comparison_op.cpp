#include<iostream>
using namespace std;
int main(){
    int a = 3,b = 5;
    bool result;

    result =( a == b);
    cout<< a<< " == " << b << " is " << result<<endl;
    cout<< a<< " != " << b << " is " << ( a != b )<<endl;
    cout<< a<< " < " << b << " is " << ( a < b )<<endl;
    cout<< a<< " <= " << b << " is " << ( a <= b )<<endl;
    cout<< a<< " > " << b << " is " << ( a > b )<<endl;
    cout<< a<< " >= " << b << " is " << ( a >= b )<<endl;

    return 0;
}
