#include<iostream>
using namespace std;

int main(){

    char ch;

    cout << "If you enter 'q', program will terminate!" << endl;

    do{
        cout << "Enter any character except 'q': ";
        cin >> ch;

        if(ch == 'q'){
            cout << "Program terminates....." << endl;
        }
        else if(ch >= '0' && ch <= '9'){
            cout << ch << " is a digit" << endl;
        }
        else{
            cout << ch << " is not a digit" <<endl;
        }
    }while(ch != 'q');
    return 0;
}
