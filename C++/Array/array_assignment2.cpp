#include<iostream>
using namespace std;

int main(){

    int len = 4;
    int barCode[len];
    string name[len];
    float price[len];

    for(int i = 0;i < len;i++){
        cout << "Enter Item barCode: ";
        cin >> barCode[i];

        cout << "Enter Item name: ";
        cin >> name[i];

        cout << "Enter Item price: ";
        cin >> price[i];

        cout << endl;
    }

    cout << "_______All Items_______" << endl;
    cout << "ItemCode\tName\tPrice" <<endl;
    for(int i = 0;i < len;i++){

        cout << barCode[i] << "\t" << name[i] <<"\t" << price[i] << endl;

    }

    cout << "\n_______Items(price > 300)_______" << endl;
    for(int i = 0;i < len;i++){

        if(price[i] > 300){
            cout << name[i] << "\t" << price[i] <<endl;
        }
    }

    int code;
    int index = -1;
    cout << "\nEnter barcode: ";
    cin >> code;

    for(int i = 0;i < len;i++){

        if(barCode[i] == code){
            index = i;
            break;
        }
    }
    if(index){
        cout << "Code: " << barCode[index] << endl;
        cout << "Name: " << name[index] << endl;
        cout << "Price: " << price[index] << endl;
    }
    else{
        cout << "Code- " << code << " does not exit!";
    }

    return 0;
}
