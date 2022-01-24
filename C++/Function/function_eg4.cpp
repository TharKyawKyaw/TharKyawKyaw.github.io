#include<iostream>
using namespace std;

string brands[5];
int index = 0;

void addBrand(string name){
    brands[index] = name;
    index++;
}

void showData(){
    for(int i = 0;i < 5;i++){
        cout << brands[i] << endl;
    }
}

int main(){

    addBrand("iPhone");
    addBrand("Samsung");
    addBrand("Vivo");

    cout << "\n_____Brand List_____" << endl;
    showData();

    return 0;
}
