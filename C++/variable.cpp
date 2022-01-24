#include<iostream>
using namespace std;

///global place (global variable)
int a = 10;

void display(){

    ///inside fun(local variable)
    int a = 20;

    cout<<"\nValue of a inside fun: "<< a;
}

void displayAnother(int a){

    cout<<"\nValue of a inside fun parameter: "<< a;

}

int main(){

    cout<<"\nValue of a: "<< a;

    display(); ///fun calling statement

    displayAnother(30

    return 0;
}

