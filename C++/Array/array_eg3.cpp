#include<iostream>
using namespace std;

int main(){

    string names[5];

    cout << "Enter name: ";
    cin>>names[0];

    cout << "Enter name: ";
    cin>>names[1];

    cout << "Enter name: ";
    cin>>names[2];

    cout << "Enter name: ";
    cin>>names[3];

    cout << "Enter name: ";
    cin>>names[4];

    cout << "\n\n_______Name List_______\n\n";
    cout << names[0] << endl;
    cout << names[1] << endl;
    cout << names[2] << endl;
    cout << names[3] << endl;
    cout << names[4] << endl;

    return 0;
}
