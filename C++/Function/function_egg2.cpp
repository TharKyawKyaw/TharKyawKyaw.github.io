#include<iostream>
using namespace std;

void checkLogin(){
    string email,pass;

    userInput:
    cout << "Enter email: ";
    cin>> email;

    cout << "Enter Password: ";
    cin >> pass;

    if(email == "mmit@gmail.com" && pass == "123")
        cout << "\nLogin Success....." << endl;

    else{
        int num;
        cout << "\nEmail and password do not match!" << endl;
        cout << "If you want to try again, press '1': ";
        cin >> num;
        if(num == 1)
            goto userInput;
    }
}

int main(){

    cout << "Before invoking function" << endl;
    checkLogin();
    cout << "After invoking function" << endl;

    return 0;
}
