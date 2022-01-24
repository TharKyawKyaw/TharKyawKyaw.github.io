#include<iostream>
using namespace std;

int main(){
    int empId;
    int salary;
    string name;
    string address;
    float bonus;

    /// user input
    cout << "Enter Employee No : ";
    cin >> empId;
    cin.ignore();
    cout << "Enter Employee name : ";
    ///cin >> name;
    getline(cin,name);
    cout<< "Enter address : ";
    //cin >> address;
    getline(cin,address);

    cout << "Enter salary : ";
    cin >> salary;

    cout << "Enter bonus : ";
    cin >> bonus;

    cout << "\n__________Employee Information___________\n\n";
    cout << "ID : " <<empId <<endl;
    cout << "Salary : "<<salary << endl;
    cout << "Name : "<< name << endl;
    cout << "Address : "<<address << endl;
    cout << "Bonus : "<< bonus << endl;
    return 0;
}
