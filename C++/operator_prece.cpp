#include<iostream>
using namespace std;

int main(){

    int a = 20 , b = 10 , c = 15 , d = 5 ;
    int e;

    e = (a + b)* c / d; /// (30) *15 / 5 = 450/5
    cout << " (a + b)* c / d is "<< e << endl;

    e = ((a+b) * c) / d; /// ((30)*15)/5 = 450/5
    cout << " ((a + b)* c) / d is "<< e << endl;

    e = (a + b) * (c / d);  /// (30) * (3) = 90
    cout << " (a + b) * (c / d) is " << e << endl;

    e = a + (b * c) / d; /// 20 + 150/5 = 20+30 = 50
    cout << " a + (b * c) / d is " << e << endl;


    return 0;
}
