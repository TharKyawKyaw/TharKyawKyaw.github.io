#include<iostream>
using namespace std;

int main(){

    string uName , uPass;

    cout << "Enter user name: ";
    getline(cin,uName);

    cout << "Enter password: ";
    getline(cin,uPass);

    if(uName == "mmit" && uPass == "admin123"){
        cout << "Login Success.";
    }
    else if(uName != "mmit" && uPass != "admin123"){
        cout << "User name and password do not match.";
    }
    else if(uName == "mmit"){
        cout << "Only user name match";
    }
    else{
        cout << "Password is correct.";
    }


    return 0;
}
