#include<iostream>
using namespace std;

int main(){

    string uName , uPass;

    tryAgain:
    cout << "Enter user name: ";
    cin >> uName;

    cout << "Enter password: ";
    cin >> uPass;

    if(uName != "mmit" || uPass != "admin"){
        cout << "Try again!" <<endl;
        goto tryAgain;
    }

    cout << "Login Success.....";
    return 0;
}
