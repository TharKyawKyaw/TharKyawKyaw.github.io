#include<iostream>
using namespace std;
class SaleRecord{
public:
    string itemName;
    double unitPrice;
    int saleQty;

    void addSaleRecord(string item,double price,int qty){
        itemName = item;
        unitPrice = price;
        saleQty = qty;
    }

    double getSubTotal(){
        return (unitPrice * saleQty);
    }

    void displayInfo(){
        cout << endl;
        cout << itemName << "\t";
        cout << unitPrice << " ks.\t";
        cout << saleQty << "\t";
        cout << getSubTotal() << " ks.";
        cout  << endl;
    }

};


int main(){
    ///create object
    SaleRecord record1 , record2 , record3;

    SaleRecord record4 = Record();

    return 0;

}
