#include<iostream>
using namespace std;

int main(){

    int productPrice;
    int discount;

    cout << "Enter Product Price: ";
    cin >> productPrice;

    cout << "Discount Value: ";
    cin >> discount;

    int discountPrice = (productPrice/100)*discount;
    int finalPrice = productPrice - discountPrice;

    cout << "After discount price: " << finalPrice;

    return 0;
}
