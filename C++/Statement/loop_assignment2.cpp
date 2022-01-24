#include<iostream>
using namespace std;

int main(){

    int start_num , end_num;
    int div_both , div_eight ,div_five , div_none;
    cout << "Enter start value: ";
    cin >> start_num;

    cout << "Enter end value: ";
    cin >> end_num;

    cout << "The numbers divided both 8 and 5:" << endl;
    for(int i = start_num ; i <= end_num ;i++){
        if(i%8 == 0 && i%5 == 0){
            cout << i << endl;
        }
    }

    cout << "The numbers divided only by 8:" << endl;
    for(int i = start_num ; i <= end_num ;i++){
        if(i%8 == 0 && i%5 != 0){
            cout << i << endl;
        }
    }

    cout << "The numbers divided only by 5:" << endl;
    for(int i = start_num ; i <= end_num ;i++){
        if(i%8 != 0 && i%5 == 0){
            cout << i << endl;
        }
    }

    cout << "The numbers not divided by 8 and 5:" << endl;
    for(int i = start_num ; i <= end_num ;i++){
        if(i%8 != 0 && i%5 != 0){
            cout << i << endl;
        }
    }


    return 0;
}
