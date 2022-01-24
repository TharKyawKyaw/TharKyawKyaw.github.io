#include<iostream>
using namespace std;

class Fruit{
    ///data
    public:
        int price;
        string name;
    ///method
    void setData(string na,int price){
        name = na;
        this->price = price;
    }

    void showData(){
        cout << "Name: " << name << endl;
        cout << "Price: " << price << endl;
    }
};



int main(){
    /// create object
    Fruit fruit1;
    Fruit fruit2;

    /// access object's data
    fruit1.name = "Orange";
    fruit1.price = 300;

    cout << "Name: " << fruit1.name << endl;
    cout << "Price: " << fruit1.price << endl;

    fruit2.setData("Banana" , 500);
    fruit2.showData();

    return 0;
}
