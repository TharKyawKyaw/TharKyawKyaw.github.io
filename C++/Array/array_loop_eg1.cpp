#include<iostream>
using namespace std;

int main(){

    int mark[3] = {100,70,90};

    cout << "\n______All Marks______\n\n";

    for(int i = 0; i < 3 ; i++){
        cout << "mark[" << i << "]"  << " = " << mark[i] << endl;
    }

    string names[4] = {"Aung Aung" , "Nilar" , "Honey" , "JK"};

    cout <<"\n_______All Names______\n\n";
    int i=0;
    while(i<4){
        cout << names[i] << endl;
        i++;
    }


    return 0;
}
