#include<iostream>
using namespace std;

int main(){

    int num;
    string result;
    cout << "Enter a number: ";
    cin >> num;

    /*(num%2 == 0) ? cout << num << " is Even number." : cout << num << " is Odd number."; */

    result = (num%2 == 0) ? "Even" : "Odd";
    cout << num << " is " << result << " number.";

    return 0;
}
