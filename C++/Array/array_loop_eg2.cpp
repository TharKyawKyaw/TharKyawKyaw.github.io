#include<iostream>
using namespace std;

int main(){

    int mark[4];

    for(int i = 0; i < 4; i++){
        cout << "Enter mark " << i+1 << ": ";
        cin >> mark[i];
    }

    ///user output
    int i = 0;
    cout << "\n_______All Marks______\n\n";
    while(i < 4){
        cout << mark[i] << "\t";
        i++;
    }

    i = 0;
    /// total
    int total = 0;

    do{

        total = total + mark[i];
        i++;
    }while(i < 4);

    cout << "\nTotal Mark: " << total;
    cout << "\nAvg Mark: " << (float)total/4;
    return 0;
}
