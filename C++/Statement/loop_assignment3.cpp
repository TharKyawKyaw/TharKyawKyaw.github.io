#include<iostream>
using namespace std;

int main(){

    int num , sum;

    cout << "Enter a number: ";
    cin >> num;

    cout << "The sum of digit " << num  << " is ";

    do{
        sum = sum +(num%10);
        num = num/10;
    }while(num%10 != 0);

    cout << sum;
    return 0;
}
