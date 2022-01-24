#include<iostream>
using namespace std;

int main(){

    int num1 , num2;

    cout << "Enter start number: ";
    cin >> num1;

    cout << "Enter end number: ";
    cin >> num2;



    for(int j = 1 ; j <= 12 ; j++){

        for(int i = num1; i <= num2 ; i++){

            cout << i << " x " << j << " = " << (i*j) << "\t";

        }
        cout << "\n";
    }



    return 0;
}
