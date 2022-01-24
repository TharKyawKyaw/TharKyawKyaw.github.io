#include<iostream>
using namespace std;

int findMax(int,int);

int findMax(int a,int b){
    return (a > b) ? a : b;
}

int main(){

    int n1,n2;
    cout << "Enter two numbers: ";
    cin >> n1 >> n2;

    cout << "Max number is " << findMax(n1,n2);

    return 0;
}
