#include<iostream>
using namespace std;

int main(){

    int num = -1;

    cout << "If you entered zero, program will stop." <<endl;

    while(num != 0){
        cout << "Enter a number: ";
        cin>> num;
        cout << "\n";
    }
    /*
    for(int i=1 ; num != 0 ; i++){

        cout << "Enter a number: ";
        cin >> num;
        cout << "\n";
    }
    */

    return 0;
}
