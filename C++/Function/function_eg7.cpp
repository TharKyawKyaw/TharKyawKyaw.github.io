#include<iostream>
using namespace std;

void display(char ch = '*',int no = 3){
    for(int i = 0;i < no;i++)
        cout << ch << " ";

    cout << endl;
}

int main(){

    cout << "No argument passed: " << endl;
    display();
    cout << "1 argument passed: " << endl;
    display('8');
    cout << "2 argument passed: " << endl;
    display('#' , 10);
    return 0;
}
