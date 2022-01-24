#include<iostream>
using namespace std;

int main(){

    int time;
    string result;

    cout << "Enter time: ";
    cin >> time;

    result = (time < 10) ? "Good Morning" : ((time < 20) ? "Good Day" : "Good Evening");

    cout << result;

    return 0;
}
