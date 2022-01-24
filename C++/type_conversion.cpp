#include<iostream>
using namespace std;

int main(){

    int num1 = 25;
    float num2 = num1; /// OK (implicit type cast)

    cout << "num1 = " << num1 << endl;
    cout << "num2 = " << num2 << endl;

    float a = 2.4;
    int b = (int)a; /// Explicit type cast

    cout << "a = " << a <<endl;
    cout << "b = " << b <<endl;
    return 0;
}
