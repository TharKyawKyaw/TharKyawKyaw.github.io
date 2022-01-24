#include<iostream>
using namespace std;
bool equals (int arg1,int arg2){
    return (arg1 == arg2);
}

bool equals (double arg1,double arg2){
    return (arg1 == arg2) ? true : false;
}

bool equals (char arg1,char arg2){
    return (arg1 == arg2) ? true : false;
}

bool equals (string arg1 , string arg2){
    return (arg1 == arg2);
}

int main(){

    cout << "9 equal to 9 : " << equals(9,9);
    cout << "\n\"abc\" equal to \"def\" : " << equals("abc","def");
    cout << "\n'A' equal to 'A' : " << equals('A','A');
    cout << "\n12.5 equal to 13.5 : " << equals(12.5,13.5);


    return 0;

}
