#include<iostream>
using namespace std;

int main(){
    int totalSec;
    cout << "Enter total seconds: ";
    cin >> totalSec;

    int hour = totalSec/3600 ;
    int mins = (totalSec%3600)/60 ;
    int sec = (totalSec%3600)%60;

    cout << "Hours: " << hour << endl;
    cout << "Minutes: " << mins << endl;
    cout << "Seconds: " << sec << endl;
    return 0;
}
