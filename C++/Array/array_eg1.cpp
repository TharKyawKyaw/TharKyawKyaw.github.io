#include<iostream>
using namespace std;

int main(){


    int mark1[5] = {90,50,53,70,80};

    int mark2[5];

    int mark3[5] = {90,50,53};

    ///int mark4[5] = {90,50,53,80,95,1000};

    int mark4[] = {90,50,25,60,400,90,100};

    int rno = 10;


    cout << sizeof(rno) << " bytes" << endl;
    cout << "No. of items in mark4 : " << sizeof(mark4)/sizeof(int) << endl;
    cout << sizeof(mark4) << " bytes" << endl;

    return 0;
}
