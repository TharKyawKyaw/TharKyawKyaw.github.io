#include<iostream>
using namespace std;

string cities[3];

void initData(){
    for(int i = 0;i < 3;i++){
        cout << "Enter city name: ";
        getline(cin,cities[i]);
    }
}

void showData(){

    cout << "_______All cities_______\n\n";
    for(int i = 0;i < 3;i++){
        cout << cities[i] << endl;
    }
}

int main(){

    cout << "\n_____Function calling_____\n";
    initData();
    showData();

    return 0;
}
