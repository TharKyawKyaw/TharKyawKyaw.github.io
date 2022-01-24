#include<iostream>
using namespace std;

int main(){

    int days;

    cout << "Enter no. of days: ";
    cin >> days;

    int year = days/365;
    int month = (days%365)/30;
    int day = (days%365)%30;

    cout << "Years: " << year << endl;
    cout << "Months: " << month << endl;
    cout << "Days: " << day;

    return 0;
}
