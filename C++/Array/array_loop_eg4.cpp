#include<iostream>
using namespace std;

int main(){

    int len = 4;
    int numbers[len] = {13,11,19,2};

    cout << "\n_______Elements in Array_______\n\n";
    for(int i = 0;i < len; i++){
        cout << numbers[i] << "\t";
    }

    int max_val = numbers[0];
    int min_val = numbers[0];
    for(int i = 1; i < len; i++){

        if(numbers[i] > max_val){
            max_val = numbers[i];
        }
        else if(numbers[i] < min_val){
            min_val = numbers[i];
        }
    }

    cout << "\n\nLargest Number: " << max_val << endl;
    cout << "Smallest Number: " << min_val << endl;

    return 0;
}
