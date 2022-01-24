#include<iostream>
using namespace std;

int main(){

    int num;

    cout << "If you enter zero, program will stop..." << endl;

    do{
        cout << "Enter a number: ";
        cin >> num;

        if(num < 0){
            cout << num << " is negative number.";
            cout << endl;
        }
        else if(num > 0){
            cout << num << " is positive number.";
            cout << endl;
        }


    }while(num != 0);

    return 0;
}
