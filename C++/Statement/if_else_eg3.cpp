#include<iostream>
using namespace std;

int main(){
    int num;
    cout << "Enter any number: ";
    cin >> num;

    if(num%5 == 0 || num%3 == 0){
        cout << num << " is divisible with 5 or 3!" << endl;
    }
    else{
        cout << num << " is not divisible with 5 and 3!"<< endl;
    }
    return 0;
}
