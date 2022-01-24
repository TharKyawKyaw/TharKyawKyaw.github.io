#include<iostream>
using namespace std;

int main(){

    int price , quantity , expense;
    int discount = 10;

    cout << "Enter item quantity: ";
    cin >> quantity;

    cout << "Enter item price: ";
    cin >> price;

    int amount = price * quantity;

    if(amount <= 5000){
        expense = amount;
    }
    else{
        expense = amount - (amount/100)*discount;
    }

    cout << "Total Expanse: " << expense;

    return 0;
}
