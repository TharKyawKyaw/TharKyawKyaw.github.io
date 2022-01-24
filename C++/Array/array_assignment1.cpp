#include<iostream>
using namespace std;

int main(){

    int len = 5;
    int numbers[len];
    bool found = false;
    int numCount;
    for(int i = 0;i < len;i++){
        cout << "Enter number: ";
        cin >> numbers[i];
    }

    for(int i = 0;i < len;i++){

        if(numbers[i]%3 == 0){
            found = true;
            break;
        }

    }
    int i = 0;
    if(found){
        cout << "\nThe numbers divisible by 3" << endl;
        while(i < len){
            if(numbers[i]%3 == 0){
                cout << numbers[i] << endl;
            }
            i++;
        }
        /*
        for(int j = 0;j < len;j++){

            if(numbers[j]%3 == 0){
                cout << numbers[j] << endl;
            }

        }
        */
    }
    else{
        cout << "\nThere is no numbers divisible by 3!" << endl;
    }




    return 0;
}
