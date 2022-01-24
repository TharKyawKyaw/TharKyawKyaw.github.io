#include<iostream>
using namespace std;

int main(){

    int num1[2][3] = { {100,20,35},{40,555,600} };

    int num2[2][3] = { {10,54,30} };

    int num3[2][3] = { {100,80} , {90,70} };

    int num4[2][3] = { {100,80} , {90} };

    int num5[][3] = { {10,54} , {50,600,700} , {13,456,479} };

    int num6[2][3] = {};

    int num7[][3] = {10,54,30,90}; /// Ok but not use cause can confuse with one dimension array

    int num8[2][3] = {100,54,80,100};

    /// int num9[2][] = {10,54,90,80,100}; ///column must be enter

    cout << num8[1][2];

    return 0;
}
