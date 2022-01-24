#include<iostream>
using namespace std;

int main(){

    cout << "_______For Loop_______" << endl;
    for(int i = 0 , j = 10 ; (i < 5 && j >= 1) ; i++,j-- ){
        cout << "i = " << i << "\tj= " << j << endl;
    }

    return 0;
}
