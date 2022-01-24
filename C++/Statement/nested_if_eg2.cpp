#include<iostream>
using namespace std;

int main(){

    float bmi;

    cout << "Enter your bmi value: ";
    cin >> bmi;

    if(bmi < 18.5 ){
        cout << "Underweight" << endl;
    }
    else{
        if(bmi >= 18.5 && bmi <= 24.9){
            cout << "Normal Weight" << endl;
        }
        else{
            if(bmi >= 25 && bmi <= 29.9){
                cout << "Over Weight" << endl;
            }
            else{
                cout << "Obesity" << endl;
            }
        }
    }

    return 0;
}
