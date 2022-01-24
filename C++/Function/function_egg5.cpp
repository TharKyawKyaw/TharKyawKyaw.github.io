#include<iostream>
using namespace std;

bool checkLogin(string,string);



int main(){

    string email,passwrod;
    cout << "Enter email: ";
    cin >> email;
    cout << "Enter password: ";
    cin >> passwrod;

    if(checkLogin(email,passwrod) == 1){
        cout << "Login Success......" << endl;
    }
    else{
        cout << "Login Fail......" << endl;
    }


    return 0;
}

bool checkLogin(string email,string pass){
     /*if(email == "mmit@gmail.com" && pass == "123")
        return true;

    else
        return false; */

    return (email == "mmit@gmail.com" && pass == "123") ? true : false;
}
