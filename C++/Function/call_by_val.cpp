#include<iostream>
using namespace std;

///call by value
void changeValue(int val){
    val = val + 20;
    cout << "Value inside function: " << val;
    cout << endl;
}

///call by ref
void editValue(int *val){
    *val = *val + 20;
    cout << "Value inside function: " << (*val);
    cout << endl;
}

int main (){
    /*
    int num = 10;
    cout << "Before calling function num = " << num << endl;
    changeValue(num);
    cout << "After calling function num = " << num << endl;
    */
    int num = 10;
    cout << "Before calling function num = " << num << endl;
    editValue(&num);
    cout << "After calling function num = " << num << endl;
    return 0;
}
