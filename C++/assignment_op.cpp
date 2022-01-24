#include<iostream>
using namespace std;

int main(){

    int a,b;

    a = 7;
    b = 2;

    cout << "a = " << a << endl;
    cout << "b = " << b << endl;

    a += 10 ; /// a = a + 10 => a = 17
    cout << "a = " << a << endl;

    b -= a ;
    cout << "b = " << b << endl;

    a = 10;
    a %= 5;
    cout << "After a %= 5, a = "<< a << endl;


    return 0;
}
