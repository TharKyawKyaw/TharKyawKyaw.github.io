#include<iostream>
using namespace std;

int main(){

    int num;
    cout << "Enter a number: ";
    cin  >> num;

    ///Verify even or odd
    if(num%2 == 0){
        cout << num << " is even" << endl;
    }
    else{
        cout<< num << " is odd"<< endl;
    }

    cout<<"________Final Statement_______"<<endl;

    return 0;
}
