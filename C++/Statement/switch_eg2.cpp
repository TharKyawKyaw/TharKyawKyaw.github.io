#include<iostream>
using namespace std;

int main(){

    char grade;
    cout << "Enter your grade: ";
    cin >> grade;
    bool result = true;
    switch(grade){
        case 'A':
            cout << "Excellent" <<endl;
            break;

        case 'B':
            cout << "Credit" <<endl;
            break;

        case 'C':
            cout << "Well Done" <<endl;
            break;

        case 'D':
            cout << "You pass" <<endl;
            break;

        case 'E':
            cout << "Better try again" <<endl;
            break;

        default:
            cout << "Invalid grade" <<endl;
            result = false;
    }

    if(result)
         cout << "Your grade is " << grade;


    return 0;
}
