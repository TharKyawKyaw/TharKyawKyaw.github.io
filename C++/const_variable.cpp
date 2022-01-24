#include<iostream>
using namespace std;

int main(){
    const int LENGTH = 10;
    const int WIDTH = 5;
    const string NAME = "Rectangle";
    int area;

    area = LENGTH  * WIDTH;
    cout<< "Value of length: "<<LENGTH;
    cout<< "\nValue of width: "<<WIDTH;
    cout<< "\nValue of name: "<<NAME;
    cout<< "\nValue of area: "<<area;

    return 0;
}
