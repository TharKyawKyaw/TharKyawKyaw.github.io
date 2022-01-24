#include<iostream>
using namespace std;

int main(){
    int amount , rate , month;

    cout << "Enter loan amount: ";
    cin >> amount ;

    cout << "Enter rate: ";
    cin >> rate;

    cout << "Enter number of month: ";
    cin >> month;

    int monthlyTnterest = (amount/100) * rate;
    int totalInterest = monthlyTnterest * month;

    cout << "Monthly Interest: " << monthlyTnterest << endl;
    cout << "Your Interest is: " << totalInterest << endl;

    return 0;
}
