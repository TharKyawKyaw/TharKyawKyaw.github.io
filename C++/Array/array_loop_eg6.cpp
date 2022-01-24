#include<iostream>
using namespace std;

int main(){

    ///create arrau
    int len = 3;
    int ids[len];
    string names[len];
    int salaries[len];
    string cities[len];


    ///user input
    for(int i = 0; i < len ; i++){

        cout << "Enter data for employee " << (i+1) << endl;
        cout << "ID: ";
        cin >> ids[i];

        cout << "Name: ";
        cin >> names[i];

        cout << "Salary: ";
        cin >> salaries[i];

        cout << "City: ";
        cin >> cities[i];
        cout << endl << endl;

    }

    ///diaplay all
    cout << "EmpID\tName\tSalary\tCity" << endl;
    cout <<"------------------------------" << endl;
    for(int i = 0;i < len; i++){

        cout << ids[i] << "\t";
        cout << names[i] << "\t";
        cout << salaries[i] << "\t";
        cout << cities[i] << "\n";

    }

    ///diaplay salary greater than 500000
    cout << "\n_______employee( salary > 500000 )_______\n";

    for(int i = 0;i < len ; i++){

        if(salaries[i] > 500000){
            cout << names[i] << " (" << salaries[i] << ".ks)" << "\n";

        }

    }


    ///display employee (city = yangon)
        cout << "\n_______employee( city = yangon )_______\n";

    for(int i = 0;i < len ; i++){

        if(cities[i]== "Yangon"){
            cout << names[i] << " (" << cities[i] << ")" << "\n";

        }

    }


    ///search data with empId
    int empNo;
    int index = -1;
    cout << "\nEnter employee no to search: ";
    cin >> empNo;

    for(int i = 0;i < len ; i++){

        if(empNo == ids[i]){
            index = i;
            break;
        }

    }

    if(index == -1){
        cout << "Employee doesn't exit!" << endl;
    }
    else{
        cout << "Id: " << ids[index];
        cout << "\nName: " << names[index];
        cout << "\nSalary: " << salaries[index];
        cout << "\nCity: " << cities[index];
    }
    return 0;
}
