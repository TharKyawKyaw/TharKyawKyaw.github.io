#include<iostream>
using namespace std;

int main(){

    int num;
    cout << "Enter a number: ";
    cin >> num;

    ///if(num%2 == 1){
    if(num%2){
        cout << "You entered odd number!" << endl;
    }

    return 0;
}
