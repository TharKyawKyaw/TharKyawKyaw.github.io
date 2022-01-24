#include<iostream>
using namespace std;

int addNumbers(int a,int b = 200 ,int c = 100){

    return (a + b + c);
}

int main(){

    int n1,n2,n3;
    cout << "Enter three numbers: ";
    cin >> n1 >> n2 >> n3;

    cout << "1 arg passed: " << addNumbers(n1) << endl;
    cout << "2 args passed: " << addNumbers(n1 , n2) << endl;
    cout << "3 args passed: " << addNumbers(n1 , n2 , n3) << endl;

    return 0;
}
