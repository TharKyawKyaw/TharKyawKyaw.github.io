#include<iostream>
using namespace std;

int main(){

    int s_num , e_num;
    int total = 0;
    int count_val = 0;

    cout<< "Enter start number: ";
    cin >> s_num;
    cout << "Enter end number: ";
    cin >> e_num;

    while(s_num <= e_num){
        total = total + s_num;
        s_num++;
        count_val++;


    }

    cout << "Total: " << total << endl;
    cout << "No of numbers: " << count_val;
    return 0;
}
