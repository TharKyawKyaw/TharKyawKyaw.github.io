#include<iostream>
using namespace std;

string names[3];
int rollnumbers[3];

void initData(){
    cout << "\n_______Data Entry_______\n";
    for(int i = 0;i < 3;i++){

        cout << "\nEnter data for student " << (i+1) << ":";
        cout << "\nName: ";
        cin >> names[i];
        cout << "Roll number: ";
        cin >> rollnumbers[i];
    }
}

void showData(){

    cout << "\n_______Student List_______\n";
    cout << "\nRno \t Name \n";
    for(int i = 0;i < 3;i++){
        cout << rollnumbers[i] << " \t " << names[i];
        cout << endl;
    }

}

int searchStudent(int rno){

    int index = -1;
    for(int i = 0;i < 3;i++){
        if(rno == rollnumbers[i]){
            cout << rno << endl;
            cout << rollnumbers[i];
            index = i;
            break;
        }
    }
    return index;

}

void searchStudent(string name){

    int index = -1;

    for(int i = 0;i < 3;i++){
        if(name == names[i]){
            cout << "\nRno: " << rollnumbers[i];
            cout << "\nName: " << names[i];
            index = i;
        }
    }

    if(index == -1)
        cout << name << " does not exist!";
}



int main(){

    int choose;
    userInput:

    cout << "1. data entry" << endl;
    cout << "2. display data" << endl;
    cout << "3. search with rno" << endl;
    cout <<  "4. search with name" << endl;
    cout << "Choose 1,2,3 or 4 : ";
    cin >> choose;

    if(choose == 1){
        initData();
    }
    else if(choose  == 2){
        showData();
    }
    else if(choose == 3){
        int rno;
        cout << "Enter roll number to search: ";
        cin >> rno;
        int result = searchStudent(rno);
        cout << result;
        if(result == -1){
            cout << rno << " does not exist!";
        }
        else{
            cout << "Rollnumber: " << rollnumbers[result] << endl;
            cout << "Name: " << names[result];
        }
    }
    else if(choose == 4){
        string name;
        cout << "Enter name to search: ";
        cin >> name;
        searchStudent(name);
    }
    else{
        cout << "\nInvalid number\n";
    }


    char ch;
    cout << "\nDo you want to continuse?" << endl;
    cout << "If continue, press 'y': ";
    cin >> ch;
    if(ch == 'y'){
        cout <<endl;
        goto userInput;
    }



    return 0;
}
