#include<iostream>
using namespace std;

int barCode[3];
string name[3];
int price[3];
void initializeItemData(){
    cout << "\n_______Initialize Item Data_______\n";
    for(int i = 0;i < 3;i++){
        cout << "Enter item barCode: ";
        cin >> barCode[i];
        cout << "Enter item name: ";
        cin >> name[i];
        cout << "Enter item price: ";
        cin >> price[i];
        cout << endl;
    }

}

void displayItemData(){
    cout << "\n_______Display Item Data_______\n";
    cout <<  "BarCode\tName\tPrice" << endl;
    for(int i = 0;i < 3;i++){
        cout << barCode[i] << "\t";
        cout << name[i] << "\t";
        cout << price[i] << endl;
    }
}

void searchItemByCode(int code){
    cout << endl;
    int result = -1;
    for(int i = 0;i < 3;i++){
        if(code == barCode[i]){
            result = i;
            break;
        }
    }
    if(result != -1){
            cout << "BarCode: " << barCode[result] <<endl;
            cout << "Name: " << name[result] << endl;
            cout << "Price: " << price[result] << endl;
    }
    else{
        cout << code << " not found." << endl;
    }

}

int main(){
 int choose;
    userInput:

    cout << "1. Intialize Item Data" << endl;
    cout << "2. Display Item Data" << endl;
    cout << "3. Search Item By Code" << endl;
    cout << "Choose 1,2 or 3: ";
    cin >> choose;

    if(choose == 1){
       initializeItemData();
    }
    else if(choose == 2){
       displayItemData();
    }
    else if(choose == 3){
        int searchCode;
        cout << "Enter search code: ";
        cin >> searchCode;
        searchItemByCode(searchCode);
    }
    else{
        cout << "_____Invalid number_____" << endl;
    }

    char ch;
    cout << "\nDo you want to continue?" << endl;
    cout << "If continue, press 'y': ";
    cin >> ch;
    if(ch == 'y'){
        cout <<endl;
        goto userInput;
    }

    return 0;
}
