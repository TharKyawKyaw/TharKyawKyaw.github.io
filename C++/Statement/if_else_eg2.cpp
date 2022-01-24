#include<iostream>
using namespace std;
int main(){
    int mark;

    cout << "Enter mark: ";
    cin >> mark;

    if(mark < 50 ){
        cout << "You fail exam!" << endl;
    }
    else{
        cout << "You pass exam!" << endl;
    }

    return 0;

}
