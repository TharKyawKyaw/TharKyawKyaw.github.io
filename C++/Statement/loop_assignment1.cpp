#include<iostream>
using namespace std;

int main(){


    int no_num , user_num;
    int pos_num = 0, neg_num = 0, zero_num = 0;

    cout<< "How many numbers you want to type: ";
    cin >> no_num;

    for(int i=0; i < no_num ; i++){

        cout << "Enter any number: ";
        cin >> user_num;

        if(user_num < 0){
            neg_num++;
        }
        else if(user_num > 0){
            pos_num++;
        }
        else if(user_num == 0){
            zero_num++;
        }
    }

    if(no_num != 0){
        cout << "Numbers of zero: " << zero_num << endl;
        cout << "Numbers of positive number: " << pos_num << endl;
        cout << "Numbers of negative number: " << neg_num  << endl;
    }


    return 0;
}
